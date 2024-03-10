class SBI{
    String name;
    long acc_no;
    float bank_balance;
    void display_balance(){
    System.out.println("Hello"+name);
    System.out.println("your current balance"+bank_balance);
    }
  void deposite_balance(float amount){
      bank_balance=bank_balance+amount;
    System.out.println("Hello"+name);
    System.out.println("your deposite amount"+amount);
    System.out.println("your current amount"+bank_balance);
}
void withdraw(float amount){
    if(bank_balance>=amount){
      bank_balance=bank_balance-amount;
    System.out.println("Hello"+name);
    System.out.println("your withdraw amount"+amount);
    System.out.println("your current amount"+bank_balance);}
    else{
        System.out.println("insuffient");
    }
}}

public class Main
{
public static void main(String[] args) {
   SBI customer_1 = new SBI();
   customer_1.name="harshana";
    customer_1.acc_no=123;
     customer_1.bank_balance=700;
     customer_1.display_balance();
      System.out.println();
      customer_1.deposite_balance(1000);
       System.out.println();
       customer_1.withdraw(200);
        System.out.println();
     
}
}