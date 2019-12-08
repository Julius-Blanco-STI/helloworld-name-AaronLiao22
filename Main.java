package main;
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("Hello World!");
        System.out.println("What's your name?");
        String name = scnr.nextLine();          
        System.out.println("How Old are you?");
        int age =  scnr.nextInt();             
        System.out.println("What's your address?");
        String adr = scnr.next();      
        System.out.println("Hi" + " " + name + "!");
        System.out.println("You are " + age + " years old");
        System.out.println("You live at " + adr);
    } 
}
