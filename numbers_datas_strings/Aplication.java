package numbers_datas_strings;

import java.text.NumberFormat;
import java.util.Locale;

public class Aplication {
    public static void main(String[] args) {
        double d = 1145.4;

        NumberFormat nf1 = NumberFormat.getNumberInstance();
        String s1 = nf1.format(d);
        System.out.println("Padrão Brasileiro: " + s1);

        NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en", "US"));
        String s2 = nf2.format(d);
        System.out.println("Padrão Norte Americano: " + s2);

        NumberFormat nf3 = NumberFormat.getCurrencyInstance();
        String s3 = nf3.format(d);
        System.out.println("Padrão Brasileiro: " + s3);

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String s4 = nf4.format(d);
        System.out.println("Padrão Norte Americano: " + s4);
    }
}