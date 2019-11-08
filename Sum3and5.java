public class Sum3and5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i=1;i<=1000;i++){
            if((i%3 ==0) && (i%5==0)){
                count++;
                sum = sum + i;
                System.out.println("Found Number = " + i);
            }
            if(count == 5){
                break;
            }
        }//for
        System.out.println("Sum = " + sum);
    }
}
