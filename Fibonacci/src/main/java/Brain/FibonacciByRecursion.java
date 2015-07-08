package Brain;

/**
 * Created with IntelliJ IDEA.
 * User: vaughanbd
 * Date: 7/17/14
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;

/**
 * This is an example of FibonacciByRecursion number sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025
 */
public class FibonacciByRecursion {

  public static void main(String args[]) {

    System.out.println("Enter Max Number: ");
    int number = new Scanner(System.in).nextInt();

    for(int i=0; i<=number; i++){
      System.out.print(fibonacci(i) +" ");
    }
  }

  /*Hi Theo how are you*/

  public static int fibonacci(int number){
    if (number==0){
      return 0;
    }
    if(number == 1 || number == 2){
      return 1;
    }

    return fibonacci(number-1) + fibonacci(number -2);
  }
}