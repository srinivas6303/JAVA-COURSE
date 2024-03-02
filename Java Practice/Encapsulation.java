class Encapsulation{
       //variables and method wrapping into single unit
      //using private ,getter and setter
    public static void main(String args[]){
        int password=7778; //if user enter wrong password he will not get any information
        Bank b=new Bank();
      
         b.setAmount(password,5000);
         b.getAmount(password);
    }
}
class Bank{
    private int Amount=10000;
    private int pin=7778;
    
    public void setAmount(int password, int updatedAmount){
        if(pin==password){
            Amount+=updatedAmount;
            System.out.println("Updated amount is:" + updatedAmount);
        }
        else{
            System.out.println("Invalid pin!");
            System.exit(0);
        }
    }
    
    public void getAmount(int password){
        if(pin==password){
            System.out.println("Total amount is:" + Amount);
        }
        else{
            System.out.println("Invalid pin!");
            System.exit(0);
        }
    }
}