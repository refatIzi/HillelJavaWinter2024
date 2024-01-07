package lesson_9;

import java.util.Collection;

public interface MyList {
    boolean add(String o);
    boolean add(int index, String o);
    boolean delete (String o);
    boolean delete(int i);

    String get(int index);
    boolean contain(String o);
    boolean equals (MyList collection);
    boolean clear();
    int size();
    String[] getArrays();
}
