public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int firstDigit = number;
        int reverse = 0;
        while (firstDigit != 0 ){
            int lastDigit = firstDigit % 10;
            reverse *= 10;
            reverse += lastDigit;
            firstDigit /= 10;
        }
        if(reverse == number){
            return true;
        }else{
            return false;
        }

    }
}
