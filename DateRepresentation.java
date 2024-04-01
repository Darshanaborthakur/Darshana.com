package DateandTimeAPI;

import java.util.*;

public class DateRepresentation {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); // number of years from starting
                                                                                    // year
        // that's from 1970
        System.out.println(Long.MAX_VALUE);
    }
}
