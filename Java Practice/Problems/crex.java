public class crex {
    static int rollno;
    String name;
    String clg;
    public static void main(String[] args) {
     crex cr=new crex();

        cr.rollno=12;
         cr.name="srinivas";
        cr.clg="mrec";
        System.out.println(cr.rollno+","+cr.name+","+cr.clg);

        crex ccrr;
        ccrr=cr;

        cr.rollno=48;
        cr.name="srinu";
        cr.clg="mreccc";
        System.out.println(ccrr.rollno+","+ccrr.name+","+ccrr.clg);
        System.out.println(cr.rollno+","+cr.name+","+cr.clg);

    }
}
