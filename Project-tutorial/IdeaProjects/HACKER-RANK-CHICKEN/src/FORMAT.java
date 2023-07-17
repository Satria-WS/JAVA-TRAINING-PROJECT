import java.util.Scanner;
import java.text.DecimalFormat;


public class FORMAT {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        DecimalFormat df = new DecimalFormat("000");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

//            System.out.printf("%-30.30s  %-30.30s%n", s1, df.format(x));
//            or using this way
            System.out.printf("%-15s %03d%n" , s1 ,x);
//
//            System.out.printf("%-15s" , s1);
//            System.out.printf("%03d%n" , x);
        }
        System.out.println("================================");

    }
}



