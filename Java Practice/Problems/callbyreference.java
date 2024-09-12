class CallByReference {
    int data = 50;

    public void change(CallByReference cbr) {
        cbr.data = cbr.data + 500;
        System.out.println("Method value: " + cbr.data);
    }

    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();

        System.out.println("Before change: " + cbr.data);
        cbr.change(cbr); // passing object
        System.out.println("After change: " + cbr.data);
    }
}
