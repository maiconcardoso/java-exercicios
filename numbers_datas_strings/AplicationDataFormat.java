package numbers_datas_strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AplicationDataFormat {
    public static void main(String[] args) {

        // Date date = new Date();
        // long mili = date.getTime();
        // System.out.println(mili);

        Calendar cal = Calendar.getInstance();
        cal.set(2021, 10, 11);
        Date date = cal.getTime();
        System.out.println("Padrão Calendar: " + date);

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String f1 = df1.format(date);
        System.out.println("Padrão Curto: "+ f1);

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String f2 = df2.format(date);
        System.out.println("Padrão Médio: " + f2);

        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        String f3 = df3.format(date);
        System.out.println("Padrão Longo: " + f3);

        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
        String f4 = df4.format(date);
        System.out.println("Padrão Long Americano: " + f4);

        String sd1 = "2021-07-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = sdf.parse(sd1);
            DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
            String f5 = df6.format(d1);
            System.out.println(f5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
