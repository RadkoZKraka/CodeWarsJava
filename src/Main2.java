import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence) {
        var dict = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        if (sentence.length() < dict.length) {
//            return false;
//        }

        return Arrays.asList(sentence).contains(dict);
    }

    public static boolean xor(boolean a, boolean b) {
        return a == b ? false : true;
    }

    public static int summation(int n) {
        var result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }

    public static String updateLight(String current) {
        switch (current) {
            case "red":
                return "green";
            case "green":
                return "yellow";
            case "yellow":
                return "red";
        }
        return "";
    }

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static int[] countBy(int x, int n) {
        var arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x * (i + 1);
        }
        return arr;
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

}