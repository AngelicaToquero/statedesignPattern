public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); 
       
        myAccount.activate(); 
        myAccount.suspend(); 
        myAccount.activate(); 
        System.out.println();

       // Deposit to the account
        myAccount.deposit(1000.0); 
        System.out.println(myAccount.toString()); 
        
        // Withdraw from the account
        myAccount.withdraw(100.0); 
        System.out.println(myAccount.toString()); 

        System.out.println();
        myAccount.close(); 
        myAccount.activate(); 
        myAccount.suspend(); 
    
        System.out.println();
        myAccount.withdraw(500.0); 
        System.out.println(myAccount.toString()); 
        myAccount.deposit(1000.0); 
        System.out.println(myAccount.toString()); 
    }
}
