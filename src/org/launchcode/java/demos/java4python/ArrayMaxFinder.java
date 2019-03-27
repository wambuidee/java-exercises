package org.launchcode.java.demos.java4python;

public class ArrayMaxFinder {

    public static int findMax (int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] x = {4,7,-10,12,15,28,9}; //or we can create an array by using the new keyword i.e "new int[10];" then
        // next step will be to populate the new array as it will be empty.If we know what values you want the array
        //to have,use prior method rather than do a two step process.
        int answer = findMax(x);
        System.out.println(answer);
    }
}
