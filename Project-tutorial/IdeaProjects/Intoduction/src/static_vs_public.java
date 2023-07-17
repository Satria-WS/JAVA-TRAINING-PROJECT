public class static_vs_public {

//    this way like call function

//    static method
    static void myFunction() {
        int y = 5;
        int x = 6;

        System.out.println("y + x"  + y + x);
    }

//public method
    public void myCar() {
        String color = "red";
        int date = 2004;
        int price = 100;

        System.out.println("this car" + "have" + "color" + color );
        System.out.println("data:" + date);
        System.out.println("price:" + price);
    }

//Main method
//    public class for call function
    public static void main(String[]args) {
//        static
//        Static methods can be called without creating objects
        myFunction();

//        main method
//        Public methods must be called by creating objects
        static_vs_public myObj = new static_vs_public();
        myObj.myCar();
    }


}
