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

public class OperatorChallenge {

  public static void main(String[] args) {
  System.out.println("Hello challenge");

  //  my answer
  double valueA = 20.00;
  double valueB = 80.00;
  double totalValue = (valueA + valueB) * 100;
  double totalRemainder  = totalValue % 30.00;
  boolean isValue ;
  if(totalRemainder != 0.00) {
    isValue = false;
    System.out.println("Your remaining is: " + totalRemainder);
  } else {
    isValue = true;

  }
  //check
    System.out.println(isValue);//true;




  }
}
