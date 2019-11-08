public class getEvenDigitSum {
    public static int getEvenDigitSum(int number){
    int sum = 0;
    int currentNumber = number;
    if(number < 0){
        return -1;
    }
    while(currentNumber > 0){
        if(currentNumber % 10 % 2 == 0 ){
            sum += currentNumber %10;
        }
        currentNumber /= 10;
    }
    return sum;
    }
}
