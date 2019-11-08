public class isLeapYear {
    public static void main(String[] args) {


        System.out.println(isLeapYears(1784));

        /*
         * To determine if a year is a leap year:
         * 1. If the year is evenly divisible by 4, go to step 2. Otherwise go to step 5.
         * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
         * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
         * 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
         * 5. The year is not a leap year(it has 365 days). The method isLeapYear needs to return false.
         *
         * */
    }
    public static boolean isLeapYears(int year){
        if(year < 1 || year > 9999){
            return false;
        }else if(year%4 != 0){
            return false;
        }else if( year%100 != 0){
            return true;
        }else if(year%400 != 0){
            return false;
        }else{
            return true;
        }
    }//IsLeapYear
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        switch(month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return (isLeapYears(year)) ? 29 : 28;
            case 4:case 6:case 9:case 11:
                return 30;
            default:
                return -1;
        }//switch
    }//getDaysInMonth
}
