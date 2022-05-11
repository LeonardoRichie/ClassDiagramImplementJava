import java.util.ArrayList;
public class Bank{
    private ArrayList<Customer> CustomerList = new ArrayList<Customer>();
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        Customer NewC = new Customer(f, l);
        CustomerList.add(NewC) ;

    }
    public void Introduction(){
        System.out.println("Welcome to " + this.bankName);
    }

    public int getNumOfCustomers(){
        return this.CustomerList.size();
    }

    public Customer getCustomer(int index){
        return CustomerList.get(index);
    }

    public void getList(){
        System.out.println("Here are the list of Customers: ");
        for (int x=0; x< CustomerList.size(); x++){
        System.out.println((x+1) + ". " +CustomerList.get(x).getFirstName() + " " +  
        CustomerList.get(x).getLastName());}
        System.out.println("");
    }

}