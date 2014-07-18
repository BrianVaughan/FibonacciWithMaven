package Brain;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: vaughanbd
 * Date: 7/18/14
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is an example of Fibonacci number sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025
 */
public class FibonacciByNonRecursion {

  public static void main(String args[]) {

    System.out.println("Enter Max Number: ");
    int number = new Scanner(System.in).nextInt();

    for(int i=0; i<=number; i++){
      System.out.print(fibonacci(i) +" ");
    }
  }

  public static int fibonacci(int number){
    if (number==0){                //if number 0 then return 0           number sequence 0
      return 0;
    }
    if(number == 1 || number == 2){  //if number 1 or 2 return 1         number sequence 0 1 1
      return 1;
    }
    int place1=1;
    int place2=1;
    int fibonacci=1;  //from now on take
    for(int i= 3; i<= number; i++){
      fibonacci = place1 + place2; //FibonacciByRecursion number is sum of previous two FibonacciByRecursion number
      place1 = place2;
      place2 = fibonacci;

    }
    return fibonacci; //FibonacciByRecursion number

  }

}
