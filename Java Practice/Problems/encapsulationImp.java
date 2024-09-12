class encapsulationDemo {
    private String name;

    public String getname() {
        return name;
    }

    public void Setname(String name) {
        this.name = name;
    }
}

class encapsulationImp {
    public static void main(String[] args) {
        encapsulationDemo e = new encapsulationDemo();
        e.Setname("srinu");
        System.out.println(e.getname());
    }
}