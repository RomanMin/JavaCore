package Lesson04;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("Sasha", 79091234561L);
        phoneBook.put("Dasha", 79091234562L);
        phoneBook.put("Glasha", 79091234563L);
        phoneBook.put("Masha", 79091234564L);
        phoneBook.put("Sasha ", 79091234565L);
        for (Map.Entry<String, Long> pair : phoneBook.entrySet()) {
            pair.getKey();
            pair.getValue();
            System.out.println(pair.getKey() + " : " + pair.getValue());

        }
   }
}


