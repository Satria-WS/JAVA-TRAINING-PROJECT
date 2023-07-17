public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello , Tim");

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien");

            //without the code block , this second print statement gets printed out.
            System.out.println("And I am scared of aliens");
        System.out.println("It is not an alien");

        //without the code block , this second print statement gets printed out.
        System.out.println("And I am scared of aliens");


        if(isAlien == false) {
            ////with the code block , this print statement gets printed out.
            System.out.println("It Alien Under Attack");
            System.out.println("Planet of Alien vary scared");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You gt the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

    }
}






/*sdf
* a code block allow more than one statement to be excuted
*
*
*
*
*
*
*
* */
