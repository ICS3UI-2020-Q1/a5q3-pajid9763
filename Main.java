import java.util.Scanner;
/**
 * program that finds the factorial of a given number
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  // ask the user for an integer
  System.out.println("Please enter an integer to calculate the factorial of");
  int num = input.nextInt();
  int total = 1;

  // calculate sum of factorial
  for (int i = 1; i <= num; i++){
    total = total * i;
  }  

    // tell the user what the factorial of their number is
    System.out.println(num + "!" + " = " + total);
  }
}
