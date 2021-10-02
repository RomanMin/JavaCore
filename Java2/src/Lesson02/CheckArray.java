package Lesson02;

public class CheckArray {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        inArray();
    }
    public static void inArray() throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        String[][] newArray = {
                {"01", "02", "c", "d"},
                {"11", "12", "13", "14"},
                {"5", "6", "7", "8"},
                {"15", "16", "17", "18"}
        };
        if (4 != newArray.length) throw new MyArraySizeException();
        {

            for (int i = 0; i < newArray.length; i++) {
                if (4 != newArray[i].length) throw new MyArraySizeException();
                for (int j = 0; j < newArray[i].length; j++){

                    try {
                        count = count + Integer.parseInt(newArray[i][j]);
                    }
                    catch (NumberFormatException e2) {
                        System.out.println("Ошибка в поле: " + i + ":" + j);
                    throw new MyArrayDataException();
                    }
                }
            }
            System.out.println("Сумма полей массива: " + count);

        }
    }
}
