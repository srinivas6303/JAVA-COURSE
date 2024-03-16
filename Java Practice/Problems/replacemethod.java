package Problems;

public class replacemethod {
    public static void main(String[] args) {
        //single charecter changing
        // String str="i am D.srinivas";
        // System.out.println(str);
        // String rs=str.replace('s','R');
        // System.out.println(rs);


        //replaceAll method
        String str= "This#string%contains^special*characters&."; 
        str=str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(str);


    }
    
}
