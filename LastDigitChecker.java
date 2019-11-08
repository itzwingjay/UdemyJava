public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
        } else {
            return false;
        }
    }


    public static boolean isValid(int a) {
        if (a > 9 && a < 1001) {
            return true;
        } else {
            return false;
        }
    }
}