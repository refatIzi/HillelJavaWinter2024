package lesson_12;

public class Main {

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileDate lesson12 = new FileDate("homework12.txt", 125, "/homework/lesson12/folder");
        FileDate lesson13 = new FileDate("homework13.txt", 250, "/homework/lesson13/folder");

        fileNavigator.add("/homework/lesson12/folder", lesson12);
        fileNavigator.add("/homework/lesson13/folder", lesson13);
        System.out.println("#----------------------------#");
        fileNavigator.print();
        System.out.println("#----------------------------#");

        System.out.println("Повторюємо список файлів, пов'язаних з шляхом переданим як параметр ");
        System.out.println((fileNavigator.find("/homework/lesson13/folder")));
        System.out.println("#----------------------------#");

        System.out.println("Повторюємо список файлів, розмір (в байтах) яких не перевищує значення, передане як параметр");
        System.out.println(fileNavigator.filterBySize(350));
        System.out.println("#----------------------------#");

        System.out.println("Видаляємо шлях пов'язаний з ним файли, виходячи з значення шляху, переданого як параметр.");
        System.out.println("Видаляємо файли: " + fileNavigator.remove("/homework/lesson13/folder"));
        System.out.println("#----------------------------#");
        System.out.println("Сортуємо всі наявні файли за розміром (за зростанням), потім повертає список відсортованих файлі");
        System.out.println(fileNavigator.sortBySize());
        System.out.println("#----------------------------#");

        fileNavigator.print();


    }
}
