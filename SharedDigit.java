public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second){
        if(first > 9 && first < 100 && second > 9 && second < 100){
            return (first%10 == second%10 || first/10 == second/10 || first%10 == second/10 || first/10 == second%10);
        }
        else{
            return false;
        }
    }
}
