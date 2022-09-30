//banking operation
import java.util.Scanner;
class BankApplication {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your 'Name' and 'account no' to access your Bank account:");
         String name = sc.nextLine();
         String accountnum = sc.nextLine();
         accountopenning obj1 = new accountopenning(name, accountnum);
         obj1.accountopennig();}}
class accountopenning{
    double bal;
    String customerName;
    String customername2;
    private String accountnum;
   accountopenning(String customerName,String accountnum){
        this.customerName=customerName;
        this.customername2=customerName;
        this.accountnum =accountnum ;
    }
    public void setAmount() { // For Adding Amount
        double accountBalance= bal;
    }
    public void getAmount() { // For printing account details
        System.out.println("Account Holder: "+accountnum);
        System.out.println("Account Balance: "+bal);
    }
    public void withDrawAmount(double amount) {
        if(amount!=0 && bal>=amount){
        }
        else if(bal<amount){
            System.out.println("Bank balance insufficient");
        }

        bal -= amount;
        System.out.println("Withdraw of INR " + amount + " successful.\nYour updated balance is: " + bal);
   }public void accountopennig() {
       char option;
        Scanner sc = new Scanner(System.in);
        BankApplication a = new BankApplication();
        System.out.println("Welcome " + customerName);
        System.out.println("Your account no:" + accountnum);
        System.out.println("\n");
        System.out.println("a) Check Balance " + 40500);
        System.out.println("b) Withdraw Amount "+500);
        System.out.println("c) after wihdraw check blance " + 40000);
        System.out.println("Enter your 'Name' and 'account no' to access your Bank account:");
        String name = sc.nextLine();
        String accountnum = sc.nextLine();
        accountopenning obj1 = new accountopenning(name, accountnum);
        obj1.accountopennig();
        BankApplication a1 = new BankApplication();
        System.out.println("Welcome " + customername2);
        System.out.println("Your account no:" + accountnum);
        System.out.println("a) Check Balance -" + 40000);

        System.out.println("b) Withdraw Amount- " + 1000);
        System.out.println("c) after wihdraw check blance- " + 30000);
    }}



