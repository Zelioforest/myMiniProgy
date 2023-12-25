// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String poly = "level";
        //boolean flag = true;
        if (chekPoly(poly)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean chekPoly(String poly){
        int len = poly.length();
        int k = len-1;
        for (int i = 0; i < len / 2; i++) {
            if (poly.charAt(i) != poly.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }
}