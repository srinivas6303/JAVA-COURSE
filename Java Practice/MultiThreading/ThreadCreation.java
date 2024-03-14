package MultiThreading;

/**
 * ThreadCreation in 2 ways
 * 1.extends Thread class
 * 2.implements Runnable interface
 */




 //1.extends Thread class
//  class Threadextend extends Thread{
//     public void run(){
//         System.out.println("Thread Name is:"+Thread.currentThread().getName());
//     }
// }



// public class ThreadCreation {
//     public static void main(String[] args) {
//         System.out.println("hello");
//         System.out.println("Thread Name is:"+Thread.currentThread().getName());
//         Threadextend e=new Threadextend();
//         e.setName("my_thread");
//         e.start();
//     }

// }


//2.implements Runnable interface
class RI implements Runnable{
        public void run(){
            System.out.println("Thread Name is:"+Thread.currentThread().getName());
        }
    }
    
    
    
    public class ThreadCreation {
        public static void main(String[] args) {
            System.out.println("hello");
            System.out.println("Thread Name is:"+Thread.currentThread().getName());
            RI e=new RI();
            Thread t=new Thread(e);
            t.setName("my_thread");
            t.start();
        }
    
    }





