import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
    Bank BankBin = new Bank("Bank Binus");
    BankBin.addCustomer("Leonardo", "Richie");
    BankBin.Introduction();
    int x = 0;
    while (x==0){
        //print Instruction
        System.out.println(
        "What would you like to do?"+
        "\n" + "1. Add Customer" +
        "\n" + "2. Print List" +
        "\n" + "3. Deposit" +
        "\n" + "4. Withdraw" +
        "\n" + "5. Check Balance"+
        "\n" + "6. Check How many Customers"+
        "\n" + "7. Exit"+
        "\n"
        );
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        int y = Obj.nextInt();

        if (y == 1){//Add Customer
            Scanner Obja = new Scanner(System.in);
        System.out.println("Enter a Customer Front Name");
        String FName = Obja.nextLine();
            Scanner Objb = new Scanner(System.in);
        System.out.println("Enter a Customer Last Name");
        String LName = Objb.nextLine();
        BankBin.addCustomer(FName, LName);

        }

        if (y == 2){//Print List
            BankBin.getList();
        }

        if (y == 3){//Deposit
            BankBin.getList();
            Scanner ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        int CustNum = ObjNum.nextInt();
        System.out.println("");
        while(CustNum < 0 || CustNum>BankBin.getNumOfCustomers()){
            //check if the number are available in the list
            BankBin.getList();
            ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        CustNum = ObjNum.nextInt();
        System.out.println("");
        }
        
        Scanner ObjDep = new Scanner(System.in);
        System.out.println("How many do you want to deposit");
        Double NumDep = ObjDep.nextDouble();
        
        while(NumDep<0){
            System.out.println("Must be positive");
            ObjDep = new Scanner(System.in);
        System.out.println("How many do you want to deposit");
        NumDep = ObjDep.nextDouble();
        }

        BankBin.getCustomer(CustNum-1).getAccount().deposit(NumDep);
        System.out.println("Deposit done"+"\n");
        }

        if (y == 4){//Withdraw
            BankBin.getList();
            Scanner ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        int CustNum = ObjNum.nextInt();

        System.out.println("");
        while(CustNum < 0 || CustNum>BankBin.getNumOfCustomers()){
            //check if the number are available in the list
            BankBin.getList();
            ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        CustNum = ObjNum.nextInt();
        System.out.println("");
        }
        
        Scanner ObjDep = new Scanner(System.in);
        System.out.println("How many do you want to withdraw");
        Double NumDep = ObjDep.nextDouble();

        while(NumDep<0 || NumDep >BankBin.getCustomer(CustNum-1).getAccount().getBalance()){
            System.out.println("Not enough money or must be positive");
            ObjDep = new Scanner(System.in);
        System.out.println("How many do you want to withdraw");
        NumDep = ObjDep.nextDouble();
        }

        BankBin.getCustomer(CustNum-1).getAccount().withdraw(NumDep);
        System.out.println("Withdraw done"+"\n");
        }

        if (y == 5){//Check Balance
            BankBin.getList();
            Scanner ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        int CustNum = ObjNum.nextInt();

        System.out.println("");
        while(CustNum < 0 || CustNum>BankBin.getNumOfCustomers()){
            //check if the number are available in the list
            BankBin.getList();
            ObjNum = new Scanner(System.in);
        System.out.println("Enter a Number to choose a customer");
        CustNum = ObjNum.nextInt();
        System.out.println("");
        }

        Double Values = BankBin.getCustomer(CustNum-1).getAccount().getBalance();
           System.out.println("The customer has $"+ Values+"\n");
        }

        if (y == 6){//Check How many Customers
            int NumCust = BankBin.getNumOfCustomers();
            System.out.println("The Bank contains: " + NumCust + " Customers" + "\n");
        }

        if (y == 7){//Exit
            System.out.println("Done");
            x=1;
        }
    }

}

}