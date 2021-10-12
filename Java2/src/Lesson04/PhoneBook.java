package Lesson04;

import java.util.*;

public class PhoneBook {


    public static void main(String[] args) {




        class CurentPhoneBook {
                        private Map<String, List<String>> curentPhoneBook = new HashMap<>();
            private List<String> phoneNumbers;

            public void addRecord(String name, String number) {

                if (curentPhoneBook.containsKey(name)) {
                    phoneNumbers = curentPhoneBook.get(name);
                    phoneNumbers.add(number);
                    curentPhoneBook.put(name, phoneNumbers);
                } else {
                    phoneNumbers = new ArrayList<>();
                    phoneNumbers.add(number);
                    curentPhoneBook.put(name, phoneNumbers);
                }
            }

            public List<String> get(String name) {
                return curentPhoneBook.get(name);
            }
        }
        CurentPhoneBook curentPhoneBook = new CurentPhoneBook();

        curentPhoneBook.addRecord("Sasha", "+79001234561");
        curentPhoneBook.addRecord("Masha", "+79001234562");
        curentPhoneBook.addRecord("Dasha", "+79001234563");
        curentPhoneBook.addRecord("Glasha", "+79001234564");
        curentPhoneBook.addRecord("Masha", "+79001234565");
        curentPhoneBook.addRecord("Masha", "+79001234567");
        curentPhoneBook.addRecord("Masha", "+79001234568");
        curentPhoneBook.addRecord("Sasha", "+79001234562");

        System.out.println("Sasha :" + curentPhoneBook.get("Sasha"));
        System.out.println("Masha :" + curentPhoneBook.get("Masha"));
        System.out.println("Dasha :" + curentPhoneBook.get("Dasha"));
    }
}








