public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructor with empty args passed in
    public bankAccount(){
        this("12345", 2.50,"Default Name", "Default email", "Default PhoneNumber");
        System.out.println("Empty constructor created");
    }

    //Constructor with info passed in
    public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account created");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String deposit(double amount){
        if(amount < 0){
            return "Invalid amount";
        }else{
            this.balance += amount;
            return "You have deposited $" + amount + " moneys. New balance is $" + this.balance;
        }
    }
    public void withdrawl(double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds. Balance is $"+ this.balance);
        }else{
            this.balance -= amount;
            System.out.println("You have withdrawn $" + amount + " moneys. New balance is $"+ this.balance);
        }
    }
}
