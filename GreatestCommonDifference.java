package Methods;

public class GreatestCommonD {

    static int gcd(int m, int n) {
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }

    public static void main(String main[]) {
        System.out.println(gcd(30, 25));
    }
}
