package lesson_11.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        Record rifat = new Record("RIFAT", "0678585858");
        Record stepan = new Record("STEPAN", "0683336798");
        Record yorik = new Record("YORIK", "0983585893");
        phoneBook.add(rifat);
        phoneBook.add(stepan);
        phoneBook.add(yorik);
        phoneBook.find(stepan);

        phoneBook.findAll(new Scanner(System.in).next());

    }
}
