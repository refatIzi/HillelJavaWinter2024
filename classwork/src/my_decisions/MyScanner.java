package my_decisions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Цей клас я написав сам замість основного класу Scanner так, як в Scanner є деякі моменти які мені не подобається
 */
public class MyScanner {
    private final InputStream in;

    public MyScanner(InputStream in) {
        this.in = in;
    }

    /**
     * клас ConcurrentLinkedQueue дуже зручний клас. Я використовую тут його замість ArrayList так, як має допоміжні
     * методу offer() за допомогою якого ми додаємо дані в list а вже за допомогою методу poll()
     * ми забираємо дані з list і при цьому він видаляє те, що починається з початку
     */
    ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();


    public int nextInt() throws IOException {
        String iNt = returns();
        return Integer.parseInt(iNt);
    }

    public double nextDouble() throws IOException {
        String doBl = returns();
        return Double.parseDouble(doBl);
    }

    public double nextFloat() throws IOException {
        String floAt = returns();
        return Float.parseFloat(floAt);
    }

    public String next() throws IOException {
        String nexT = returns();
        return nexT;
    }

    public String nextLine() throws IOException {
        byte[] buff = new byte[1024];//створюю масив байт розміром 1024
        int read = in.read(buff);//записую в buff те, що прийшло від потоку InputStream
        // System.out.println("Size buffer "+read);
        /**Додаємо в buff дані зменшуючи ращмер на -1 та як останній елемен Команда для опускання каретки на один рядок вниз
         * вона нам не потрібна */
        return new String(Arrays.copyOf(buff, read - 1));// записуємо в масив Array, видаляємо останній елемент і перетворює на рядок
    }

    private String returns() throws IOException {
        String t = "";
        if (list.size() < 1) {
            read_to_Array();
            t = list.poll();
        } else t = list.poll();
        return t;
    }


    private void read_to_Array() throws IOException {
        byte[] buff = new byte[1024];
        int read = in.read(buff);
        // System.out.println("Size buffer "+read);
        /**Додаємо в buff дані зменшуючи розмір на -1 та як останній елемен Команда для опускання каретки на один рядок вниз
         * вона нам не потрібна і розбиваємо на частини через split "" */
        String[] st = new String(Arrays.copyOf(buff, read - 1)).split(" ");

        for (int i = 0; i < st.length; i++) {
            list.offer(st[i]);
        }

    }
}