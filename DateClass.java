package DateandTimeAPI;

import java.util.*;

//the current time and date

public class Dateclass {
    public static void main(String[] args) {
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);
    }
}
