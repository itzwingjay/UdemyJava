public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int LastDigit =0;
        int FirstDigit= number;
        if(number < 0){
            return -1;
        }
        LastDigit = number %10;
        while(FirstDigit > 9){
            FirstDigit /= 10;
        }
        sum = FirstDigit + LastDigit;
        return sum;
    }
}
