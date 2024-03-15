package MultiThreading;

class Numbers extends Thread{
   public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("handle exception");
            }
        }
    }

}

class Text extends Thread{
    public void run(){
        for(char i='a';i<='e';i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("handle exception");
            }
        }
    }
}


public class Multithread {
    public static void main(String[] args) {
        Numbers n=new Numbers();
        Text t=new Text();
        n.start();
        t.start();

        
    }
    
}
