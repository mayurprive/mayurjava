package fundamentles;

import java.util.Scanner;

public class JavaCalc {

    public static void main(String arg[]){
    //this is basic comment
        //get no of ours
        System.out.println("Enter the no of hours of emp");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        //get hourly pay rate
        System.out.println("enter the emp's rate");
        Scanner scan2 = new Scanner(System.in);
        double rate = scan2.nextDouble();

        //multiply rate and hours
        double x = hours * rate;

        //display result
        System.out.println("total grosspay is "+x);

    }
}
