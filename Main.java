public class Main {
    // static method
    static void sta() {
        System.out.println("i am good");
    }

    // public method
    public void newstat() {
        System.out.println("she is good too");
    }

    public static void main(String[] args) {
        sta(); // can print statement without using the object

        Main myobj = new Main(); // Create an object and main as class
        myobj.newstat(); // Call the public method on the object
        // if call directly will cause an error
    }

}
