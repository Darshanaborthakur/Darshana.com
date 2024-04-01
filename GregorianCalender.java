package DateandTimeAPI;

import java.util.*;

public class GregorianCalenderDemo {
    public static void main(String args[]) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    }
}
