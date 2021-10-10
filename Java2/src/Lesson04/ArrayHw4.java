package Lesson04;

import java.util.*;

public class ArrayHw4 {

    public static void main(String[] args) {

        String[] newArray = {"Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3", "Word1", "Word2", "Word3"};
        Map<String, Integer> finalArray = new HashMap<>();

            for (int i = 0; i < newArray.length; i++)
                if (finalArray.containsKey(newArray[i]))
                    finalArray.put(newArray[i], finalArray.get(newArray[i]) + 1);
                else
                    finalArray.put(newArray[i], 1);
            System.out.print(finalArray);
        }

}