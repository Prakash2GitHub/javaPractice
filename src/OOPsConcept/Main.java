package OOPsConcept;

public class Main {
    // static method
    static void myStaticMethod() {
        System.out.println("Static method called without creating object");

    }
    //Public method
    public void myPublicMethod(){
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        myStaticMethod();  // call static method
        //myPublicMethod();  // compile an error

        Main myObj = new Main();
        myObj.myPublicMethod();

    }
}
