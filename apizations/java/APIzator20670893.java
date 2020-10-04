package com.stackoverflow.api;

/**
 * break statement in "if else" - java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20670893">https://stackoverflow.com/a/20670893</a>
 */
public class APIzator20670893 {

  public static void breakStatement() throws RuntimeException {
    if (choice == 5) {
      System.out.println("End of Game\n Thank you for playing with us!");
      break;
    } else {
      System.out.println("Not a valid choice!\n Please try again...\n");
    }
    int choice;
    boolean keepGoing = true;
    while (keepGoing) {
      System.out.println("---> Your choice: ");
      choice = input.nextInt();
      switch (choice) {
        case 1:
          playGame();
          break;
        case 2:
          loadGame();
          break;
        // your other cases
        // ...
        case 5:
          System.out.println("End of Game\n Thank you for playing with us!");
          keepGoing = false;
          break;
        default:
          System.out.println("Not a valid choice!\n Please try again...\n");
      }
    }
  }
}
