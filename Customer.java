
public class Customer{
    private String firstName;
    private String lastName;
    private Account account;
    
    public Customer(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
        this.account = new Account(0);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account acct){
        this.account = acct;
    }

}