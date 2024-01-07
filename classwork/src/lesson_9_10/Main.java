package lesson_9_10;

public class Main {


    public static void main(String[] args) {
        MyList myList1=new ArrayListMy();
        myList1.add("AAAA");
        myList1.add("bbbb");
        myList1.add("CCCC");
        myList1.add("dddd");
        myList1.add("EEEE");
        myList1.add("ffff");
        myList1.add("GGGG");
        myList1.add("hhhh");
        myList1.add("RRRR");



        for (String c:myList1.getArrays()) {
            System.out.println(c);
        }
        System.out.println("-------------------");

        myList1.delete(2);
        for (String c:myList1.getArrays()) {
            System.out.println(c);
        }

        System.out.println("-------------------");
        myList1.delete("ffff");
        for (String c:myList1.getArrays()) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        myList1.add(5,"LLLLLLL");
        for (String c:myList1.getArrays()) {
            System.out.println(c);
        }

        System.out.println("-------------------");
            System.out.println(myList1.get(5));
        System.out.println("-------------------");

        System.out.println("contain CCCC "+myList1.contain("CCCC")); // true
        System.out.println("contain GGGG "+myList1.contain("GGGG")); // false
        System.out.println("-------------------");

        MyList myList2=new ArrayListMy();
        myList2.add("AAAA");
        myList2.add("bbbb");
        myList2.add("dddd");
        myList2.add("EEEE");
        myList2.add("GGGG");
        myList2.add("LLLLLLL");
        myList2.add("RRRRr");

        MyList myList3=new ArrayListMy();
        myList3.add("AAAA");
        myList3.add("bbbb");
        myList3.add("CCCC");


        System.out.println("Test equals \"test1\" "+myList1.equals(myList2)); // true
        System.out.println("Test equals \"test2\" "+myList1.equals(myList3)); // false

        System.out.println("-------------------");
        myList3.clear();
        System.out.println("myList3 size= "+myList3.size());

        myList3.add("AAAA");
        myList3.add("bbbb");
        myList3.add("dddd");
        myList3.add("EEEE");
        myList3.add("GGGG");
        System.out.println("myList3 size= "+myList3.size());

    }


}
