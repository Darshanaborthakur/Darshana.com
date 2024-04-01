package Loop;

import java.util.*;

public class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int count = 0;
        int n = sc.nextInt();

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
