import java.util.Scanner;

public class NumberConversion {
    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDec(in, inRadix);
        }
        if (inRadix == 10) {
            return decToN(in, outRadix);
        }
        String dec = toDec(in, inRadix);
        return decToN(dec, outRadix);
    }

    public static String decToN(String in, int outRadix) {
        int dec = Integer.parseInt(in);
        String res = "";
        while (dec > 0) {
            int tmp = dec % outRadix;
            if (tmp < 10) {
                res = tmp + res;
            } else {
                res = (char) (tmp + 55) + res;
            }
            dec /= outRadix;
        }
        return res;
    }

    public static String toDec(String in, int inRadix) {
        in = in.toUpperCase();
        int res = 0;
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0'; //doubling method
                res = res * inRadix + d;
            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res * inRadix + d;
            }
        }
        return res + "";
    }


    public static void main(String[] args) {
        System.out.println(toRadix("11", 2, 10));
        System.out.println(toRadix("11", 8, 10));
        System.out.println(toRadix("11", 16, 10));
        System.out.println(toRadix("A1B2", 16, 2));
        System.out.println(toRadix("11", 8, 2));
        System.out.println(toRadix("20", 10, 2));
        System.out.println(toRadix("20", 10, 8));
        System.out.println(toRadix("20", 10, 16));
        System.out.println(toRadix("A", 16, 8));
        System.out.println(toRadix("10", 8, 16));
        System.out.println(toDec("1001",2));
    }
}
