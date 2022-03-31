package day31_CustomClass_Constructor;

public class CapitalOne {

    public static void main(String[] args) {

        BankOfAmerica account1=new BankOfAmerica();
        account1.setInfo("Smith Sholder",123455678);

        account1.checkBalance();
        account1.deposit(10500);
        account1.checkBalance();
        account1.withdraw(2500);
        account1.checkBalance();


        System.out.println("-----------------------------------------------------------------");

        BankOfAmerica account2=new BankOfAmerica();
        account2.setInfo("Ahmet Caglar",1234562300);
        account2.checkBalance();
        account2.deposit(5400);
        account2.checkBalance();




    }
}
