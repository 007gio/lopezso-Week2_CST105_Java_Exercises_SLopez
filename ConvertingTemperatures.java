//Sergio Lopez
//CST-105
//11/27/17
package convertingtemperatures;

import java.util.Scanner;

public class ConvertingTemperatures {
    
  public static void main(String[] args) {
      
    float temperature;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("Enter a Fahrenheit temperature:");
    temperature = in.nextInt();
 
    temperature = ((temperature - 32)*5)/9;
 
    System.out.println("100F is equivalent to = " + temperature);
    
    System.out.println("Enter a Celsius temperature:");
    temperature = in.nextInt();
 
    temperature = ((temperature * 9)/5)+32;
 
    System.out.println("100C is equivalent to = " + temperature);
  }
}   