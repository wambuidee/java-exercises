package exercises;

import java.util.ArrayList;

public class ArrayListSumEvens {
    public static void main (String [] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

       int length = numbers.size();
       int sum = 0;
        for (int i = 0; i < length; i++){
            if (numbers.get(i) % 2 == 0){
               sum += numbers.get(i);

            }

        }
        System.out.println(sum);
    }
}
