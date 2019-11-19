import java.util.Scanner;

public class MinElementArray {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("What size is the array?");

        System.out.println("Your Min Value in the array is: " + findMin(readIntegers(sc.nextInt())));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Please enter "+count +" numbers.");
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
