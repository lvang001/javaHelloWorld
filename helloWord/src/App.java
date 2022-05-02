public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        myNameIs();
        Vaction();
        hiFriend();
        
    }

    static void myNameIs() {
        String fName = "Lucky";
        String lName = "Vang";

        System.out.println("My name is" + "\n" + fName + "\n" + lName);
    }

    static void Vaction () {
        System.out.println("I'd like to visit" + "\n" + "Tokyo" + "\n" + "Japan");
    }

    static void hiFriend () {
        String fName = "Lucky";
        String lName = "Vang";

        System.out.println("Hi" + " " + fName + " " + lName);
    }

}

