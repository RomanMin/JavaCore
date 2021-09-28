package Lesson03;

public class ArraySwap {
    public static void main(String[] args) {
        int currentPosition = 0; //меняем значение позиций в которых будет происходить замена
        int newPossition = 3;
        String temp;
        String temp1;
        String[] array1 = {"a", "b", "c", "d"};


        for (int i = 0; i < array1.length; i++) {
           if (i == currentPosition) {temp = array1[currentPosition];
               temp1 = array1[newPossition];
                array1[newPossition] = temp;
               array1[currentPosition] = temp1;
                 }
            System.out.println(array1[i]);
               }

    }


}
