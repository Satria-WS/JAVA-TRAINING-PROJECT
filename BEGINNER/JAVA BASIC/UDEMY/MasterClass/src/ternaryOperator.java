public class ternaryOperator {
    public static void main(String[] args){
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true ;

        if(!isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        //example
        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Out client is " + ageText);
    }
}


/*
* The ternary operator is a shortcut to assigning one of two values to a variable , depending on a given condition
*
*
* */

