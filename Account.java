package Assignment;

public class Account{
       public String id;
       public String name;
       public int balance=0;
        
        public Account(String i,String n) {
    	   this.id=i;
    	   this.name=n;
       }
       public Account(String i,String n,int b) {
    	   this.id=i;
    	   this.name=n;
    	   this.balance=b;
       }
      
       public int credit(int amount) {
    	   balance+=amount;
		   return balance;
    	   }
       public int debit(int amount) {
    	   if(amount<=balance) {
    		   balance-=amount;
    		   return balance;
    	   }
    	   else {
    		   return (Integer.parseInt("Amount not insufficient"));
    	   }
       }
	public int transferTo(Account another,int amount) {
		System.out.println("After transfering amount into another account:");
		if(amount<=balance) {
			balance-=amount;
			another.credit(amount);
			return balance;
		}
		else {
			return (Integer.parseInt("Amount exceed"));
		}
	}
	public String  toString() {
		return ("Account Id:" + id + "\n" + "Account Name:" + name + "\n" + "Balance:" + balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account ac1=new Account("a1","Soe Soe",300000);
         Account ac2=new Account("a2","Moe Moe",100000);
         System.out.println("Account 1");
         System.out.println(ac1.toString());
         System.out.println();
         System.out.println("Account 2");
         System.out.println(ac2.toString());
         System.out.println();
         ac1.transferTo(ac2, 50000);
         System.out.println("The current value of account1" + " " + ac1.name + " " + "is" + " " + ac1.balance);
         System.out.println("The current value of account2" + " " + ac2.name + " " + "is" + " " + ac2.balance );
      }

}
