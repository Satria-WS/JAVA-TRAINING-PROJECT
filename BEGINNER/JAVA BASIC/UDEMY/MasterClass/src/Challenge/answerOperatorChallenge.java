package Challenge;
/*

 * Step 1 : create a double variable with a value of 20.00
 * Step 2 : create a second variable of type double with a value 80.00
 * Step 3 : add both numbers together, then multiply by 100.00
 * Step 4 : Use the remainder operator , to figure out what the reminder from the result of the operation in step three, and 40.00 will be.
 * Step 5 : create a boolean variable that assigns the value true , if the remainder in step four is 0.00 or false if its not zero
 * Step 6 : output the boolean variable just to see what the result is
 * Step 7: Write an if then statement that displays a message, 'got some remainder' if the boolean in step five is not true
 *
 */

public class answerOperatorChallenge {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
