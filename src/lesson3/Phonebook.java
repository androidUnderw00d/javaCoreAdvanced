package lesson3;

import sun.awt.HKSCS;

import java.util.*;

public abstract class Phonebook {

    private static ArrayList string;

    public static void main(String[] args) {

        phoneBook();

//        searchCellNumber();


    }

    private static void phoneBook() {

        List<ArrayList<String>> phoneBook = new ArrayList<>();
        ArrayList<String> Ivanov = new ArrayList<>();
        ArrayList<String> Petrov = new ArrayList<>();
        ArrayList<String> Sidorov = new ArrayList<>();
        ArrayList<String> Sorokin = new ArrayList<>();

        Ivanov.add("+7(903)3062745");
        Ivanov.add("+7(903)3102745");
        Ivanov.add("+7(903)3062747");

        Petrov.add("+7(927)3062745");
        Petrov.add("+7(927)3102747");

        Sidorov.add("+7(904)3062745");

        phoneBook.add(Ivanov);
        phoneBook.add(Petrov);
        phoneBook.add(Sidorov);
        phoneBook.add(Sorokin);

        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println(phoneBook.get(i));
        }



/*        for (ArrayList<String> strings : phoneBook) {
            System.out.println(strings.hashCode());
        }*/


    }

    private static void searchCellNumber(String surName) {

        /*  Прописать условие для поиска элемента*/
/*        if (phoneBook.contains(surName)) {
            System.out.print(surName);
        }else {
            System.out.println("Нет такого контакта");
        }*/

    }
}
