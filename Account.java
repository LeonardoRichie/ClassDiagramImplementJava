
public class Account{
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public Boolean deposit(double amt){
        while (amt < 1){
            System.out.println("Cannot deposit with 0 or negative value");
            return false;
        }
        this.balance += amt;
        return true;
    }

    public boolean withdraw(double amt){
        while (amt < 1){
            System.out.println("Cannot withdraw with 0 or negative value");
            return false;
        }
        this.balance -= amt;
        return true;
    }
    

}