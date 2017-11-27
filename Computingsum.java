 //*Sergio Lopez
 //* CST-105
 //* 11/26/17
package computingsum;

import java.util.Scanner;

public class Computingsum {

   
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

            int n;

            System.out.print("Enter a 5-digit positive integer:");

            n = in.nextInt();

            if (n <= 0)

                  System.out.println("Integer you've entered is nonpositive.");

            else {

                  int sum = 0;



                  while (n != 0) {


                        sum += n % 10;


                        n /= 10;

                  }

                  System.out.println("The sum of the digits is 1 + 2 + 3 + 4 + 5 = " + sum);

            }

      }

}
