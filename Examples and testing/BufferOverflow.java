import java.util.Scanner;

public class BufferOverflow {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] vals = new int[10];

    System.out.println("How many values should be stored in the array? ");
    int count = scan.nextInt();

    for (int i = 0; i < count; i++) { // 0 <= i < 10
      vals[i] = count - i; // 0 <= i < 10
    }

    System.out.println("Which value do you wish to retrieve? ");
    int which = scan.nextInt();

    System.out.println("Your value is " + vals[which]);
  }
 }