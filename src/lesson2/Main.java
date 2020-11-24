package lesson2;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arrayWrongSize = {{"1", "*", "3"}, {"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        String[][] arrayWrongData = {{"1", "2", "3", "4"}, {"*", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

//        System.out.println("Cумма элементов в массиве равна " + arrayElementSum(array));
        System.out.println("Cумма элементов в массиве равна " + arrayElementSum(arrayWrongSize));
//        System.out.println("Cумма элементов в массиве равна " + arrayElementSum(arrayWrongData));

    }

    private static int arrayElementSum(String[][] array) {
        final int rightArrayLenght = 4;
        int sum = 0;

        try {
            if (!chekArraySize(array)) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyArraySizeException("Не верный размер массива на входе, нужен 4х4", e);
        }

        for (int i = 0; i < rightArrayLenght; i++) {
            for (int j = 0; j < rightArrayLenght; j++) {
                try {
                    sum += parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива: " + array[i][j] + " " + "[" + i + "][" + j + "] не является числом ", e);
                }
            }
        }
        return sum;

    }

    private static boolean chekArraySize(String[][] array) {
        final int rightArrayLenght = 4;

        return array.length == rightArrayLenght && array[0].length == rightArrayLenght;
    }
}
