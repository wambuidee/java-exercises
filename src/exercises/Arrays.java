package exercises;

public class Arrays {
    public static void main(String[] args){
        System.out.println("Print array of numbers:");
        printArrayofNumbers();
    }

    public static void printArrayofNumbers(){
        int[] numbers = {1,1,2,3,5,8};

        for (int i=0; i<numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

    }
}


