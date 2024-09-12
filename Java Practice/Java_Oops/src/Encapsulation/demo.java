package Encapsulation;

class encap {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class demo{
    public static void main(String[] args) {
        encap e=new encap();
        e.setId(101);
        e.setName("srinivas");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }

}
