package Problems;


interface A {
    void first();
}

interface B {
    void second();
}

class firstimp implements A, B {
    
    public void first() {
        System.out.println("i am first method from interface A");
    }

    
    public void second() {
        System.out.println("i am second method from interface B");
    }
}

class secondimp implements A, B {
   
    public void first() {
        System.out.println("i am first method from interface A and secondimp");
    }

    
    public void second() {
        System.out.println("i am second method from interface B and secondimp");
    }
}

public class multipleInheritence {
    public static void main(String[] args) {
        firstimp s = new firstimp();
        s.first();
        s.second();

        secondimp t = new secondimp();
        t.first();
        t.second();
    }
}