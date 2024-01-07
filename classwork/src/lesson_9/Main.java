package lesson_9;

public class Main {

    //static String [] data=new String[4];
    private static String[] arrays = new String[4];
    ;
    private static int arrLength = arrays.length;

    // static int size=data.length;
    public static void main(String[] args) {

        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add("AAAA");
        myArrayList.add("bbbb");
        myArrayList.add("CCCC");
        myArrayList.add("dddd");
        myArrayList.add("EEEE");
        myArrayList.add("ffff");
        myArrayList.add("GGGG");
        myArrayList.add("hhhh");
        myArrayList.add("RRRR");


        for (String c:myArrayList.getArrays()) {
            System.out.println(c);
        }
        System.out.println("-------------------");

        myArrayList.delete(2);
        for (String c:myArrayList.getArrays()) {
            System.out.println(c);
        }

        System.out.println("-------------------");
        myArrayList.delete("ffff");
        for (String c:myArrayList.getArrays()) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        myArrayList.add(5,"LLLLLLL");
        for (String c:myArrayList.getArrays()) {
            System.out.println(c);
        }

        System.out.println("-------------------");
            System.out.println(myArrayList.get(5));

    }
}
