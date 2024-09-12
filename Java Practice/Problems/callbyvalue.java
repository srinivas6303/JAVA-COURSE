

public class callbyvalue {
    int data=50;
    void change(int data){
        data=data+100;
        System.out.println("Method data value:"+data);
    }

    public static void main(String[] args) {
        callbyvalue c=new callbyvalue();
        System.out.println("Before calling method:"+c.data);

        c.change(500);


        System.out.println("After called method:"+c.data);
    }
}
