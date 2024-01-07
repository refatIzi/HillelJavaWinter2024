package lesson_9_10;


public class ArrayListMy implements MyList {

    private String[] arrays;
    private int arrLength;
    private int iteration = 0;

    public ArrayListMy() {
        arrays = new String[0];
        iteration = 0;
        arrLength = iteration;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > arrLength) {
            return false;
        }
        arrays[index] = value;
        return true;
    }

    public boolean add(String value) {
        // if (iteration > 0) {
        //створюємо новий масив та записуємо в нього всі данні з першого масиву
        String[] newArrays = new String[arrays.length + 1];
        for (int i = 0; i < arrays.length; i++) {
            newArrays[i] = arrays[i];
        }
        //записуємо value в останній елемент масиву
        newArrays[arrays.length] = value;
        //arrays=new String[arrays.length+1];

        // записуємо данні з нового масиву в старий
        arrays = newArrays;
        arrLength = arrays.length;
        // } else arrays[0] = value;
        iteration++;

        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= arrLength) {
            return false;
        }

        // Видаляємо елемент
        arrays[index] = null;

        // Видаляємо елемент
        String[] newArrays = new String[arrays.length - 1];
        for (int i = 0; i < newArrays.length; i++) {
            if (i < index) newArrays[i] = arrays[i];
            else newArrays[i] = arrays[i + 1];
        }

        arrays = newArrays;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < arrLength; i++) {
            if (arrays[i].equals(value)) {
                return delete(i);
            }
        }

        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= arrLength) {
            return null;
        }
        return arrays[index];
    }

    @Override
    public boolean contain(String o) {
        for (String element : arrays) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(MyList collection) {
        if (collection == null) {
            return false;
        }

        if (collection.size() != size()) {
            return false;
        }

        //for (String value : collection.getArrays()) {
        for (String value : arrays) {
            /*
            if(contain(value)){
            System.out.println(value+" "+contain(value));
            }
            else  System.out.println(value+" "+contain(value));
           */
            if (collection.contain(value))
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public boolean clear() {
        arrays = new String[0];
        return false;
    }

    @Override
    public int size() {
        return arrays.length;
    }

    public String[] getArrays() {
        return arrays;
    }
}
