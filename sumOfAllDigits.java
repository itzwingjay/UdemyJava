public class sumOfAllDigits {
/*
* If the sum of the digits in a number that is greater than 10.
*
* Example: number(125) = 8;
* */


    public static int sumAllDig(int number){

        if(number < 10){
            return -1;
        }
        int sum = 0;

        while(number>0){
            //extract the last significant digit in the number;
            int digit = number %10;
            sum += digit;

            //Drop the last digit
            number /= 10;
        }
        return sum;
    }

}
