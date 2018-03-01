import java.util.Scanner;

public class Prompter{
 
  private static Scanner scanner;
  
  public Prompter() {
    scanner = new Scanner(System.in);
  }
  
  public String itemPrompt() {
    System.out.println("ADMIN PROMPT");
    System.out.println("What type of item?");
    String item = scanner.nextLine();
    return item;
  }
  
  public int maxPrompt(String item) {
    System.out.printf("What is the maximum amount of %s?%n", item);
    int max = scanner.nextInt();
    return max;
  }
  
  public int guessPrompt(String item, int max) {
    System.out.println("PLAYER PROMPT");
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d%n", item, max);
    int guess = scanner.nextInt();
    return guess;
  }
  
  public void overPrompt(){
    System.out.println("Your guess is too high");
  }
  
  public void underPrompt() {
    System.out.println("Your guess is too low");
  }
  
  public int oobPrompt(int max) {
    System.out.printf("Your guess must be less than %d%n", max);
    int guess = scanner.nextInt(); 
    return guess;
  }
  
  public void attemptsPrompt(int count){
    System.out.printf("You got it in %d attempts%n", count);
  }
}