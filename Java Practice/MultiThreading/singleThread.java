package MultiThreading;

public class singleThread {

    static void printNumber() {   //throws InterruptedException(explicit)
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Exception handled");
            }
        }
    }

    static void printText() {   //throws InterruptedException(explicit)
        for(char i='a';i<='e';i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Exception handled");
            }
        }
    }



    public static void main(String[] args) {
        printNumber();
        printText();


    }
}
