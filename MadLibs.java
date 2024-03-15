import java.util.Scanner;

public class MadLibs
{
  public static void main(String [] args)
  {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter an adjective: ");
    String adj1 = keyboard.nextLine();
    
    System.out.print("Enter a verb: ");
    String verb1 = keyboard.nextLine();
    
    System.out.print("Enter an adjective: ");
    String adj2 = keyboard.nextLine();
    
    System.out.print("Enter a thing (plural): ");
    String thing1 = keyboard.nextLine();
    
    System.out.print("Enter a verb: ");
    String verb2 = keyboard.nextLine();
    
    System.out.print("Enter an adjective: ");
    String adj3 = keyboard.nextLine();
    
    System.out.print("Enter a thing (plural): ");
    String thing2 = keyboard.nextLine();
    
    System.out.print("Enter a person's name: ");
    String person = keyboard.nextLine();
    
    System.out.print("Enter an adjective: ");
    String adj4 = keyboard.nextLine();
    
    System.out.print("Enter an adjective: ");
    String adj5 = keyboard.nextLine();
    
    System.out.print("Enter a number: ");
    int num1 = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("Enter a number: ");
    int num2  = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("Enter a thing (plural): ");
    String thing3 = keyboard.nextLine();
    
    System.out.print("Enter a thing (plural): ");
    String thing4 = keyboard.nextLine();
    
    System.out.println();
    System.out.println("Our school cafeteria has really " + adj1 + " food."); 
    System.out.println("Just thinking about it makes my stomach " + verb1 + "!");
    System.out.println("                                                 ");
    System.out.println("The spaghetti is " + adj2 + " and tastes like " + thing1 + ".");
    System.out.println("One day, I swear one of the meatballs started to " + verb2 + "!");
    System.out.println("                                                 ");
    System.out.println("The tacos are totally " + adj3 + " and look kind of like old " + thing2 + "!");
    System.out.println("                                                 ");
    System.out.println("My friend " + person + " actually likes the meatloaf even though it’s " + adj4 + " and " + adj5 + ", and goes to the lines " + num1 + " times and gets " + num2 + " every time!");
    System.out.println("I call it \"Mystery Meatloaf\" and I think it’s really made out of " + thing3 + ".");
    System.out.println("                                                 ");
    System.out.println("My dad said he’d make my lunches, but on the first day, he made a sandwich out of " + thing4 + " and peanut butter!");
    System.out.println("                                                 ");
    System.out.println("I think I’d rather take my chances with the cafeteria!");
  }
}