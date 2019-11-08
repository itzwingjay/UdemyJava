public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        // 0 and 1 are not prime numbers
        if( number < 2){
            return -1;
        }
        int i;

        /*
        * (1)start dividing from 2 until you find one that divides evenly
        * (2)Divide that number by the counter.
        * (3)Divide that new number with counter resetted at 2.
        * (4)Repeat from step 2 until cannot divide no more.
        * You are essentially dividing the numbers by either 2 or 3 which is why there is the "i--"
        * */
        for(i = 2; i <= number;i++){
            if(number % i == 0){
                number /= i;
                i--;
            }
        }
        return i;
    }
}