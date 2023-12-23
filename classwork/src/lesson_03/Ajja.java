package lesson_03;

public class Ajja {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,4,5,4,6};
        int intremuve=4;
        for(int i=0;i<arr.length;i++) {

            if(intremuve==arr[i]){
                arr[i]=arr[i+1];
                arr[i+1]=0;
            }

        }
        for(int i=0;i<arr.length;i++) {

            System.out.println(  arr[i]);


        }

    }

}
