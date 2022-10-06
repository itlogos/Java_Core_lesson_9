package ua.lviv.lgs.lessonlogos9;

import java.util.Scanner;


public class Main {
    static double a;
    static double b;
    public static void main(String[] args) throws MyException, IllegalAccessException {
          
          Scanning();
          Methods calculator = new Methods(a, b);
          
          System.out.println("Result plus = " + calculator.plus() );
          System.out.println("Result minus = " + calculator.minus() );
          System.out.println("Result multiply = " + calculator.multiply() );
          System.out.println("Result devide = " + calculator.devide() );
            
    }     
          public static void Scanning() {
              Scanner input = new Scanner(System.in);    
              System.out.println("Введіть значення a: ");
               a = input.nextDouble();
              System.out.println("Введіть значення b: ");
               b = input.nextDouble();
              }


}

