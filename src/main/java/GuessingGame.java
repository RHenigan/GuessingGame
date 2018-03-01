public class GuessingGame {
  
    public static void main(String[] args) {
      Prompter prompter = new Prompter();
      
      String item = prompter.itemPrompt();
      int max = prompter.maxPrompt(item);
      Jar jar = new Jar(item, max);
      
      int guess = 0;
      int guessCount = 0;
      
      while(guess != jar.getFill()) {
        guess = prompter.guessPrompt(jar.getItem(), jar.getMax());
        
        if (guess > jar.getMax()) {
          guess = overMaxLoop(jar.getMax(), prompter);
        }
        
        if (guess > jar.getFill()){
          prompter.overPrompt();
        }else if(guess < jar.getFill()) {
          prompter.underPrompt();
        }
        
        guessCount++;
      }
      
      prompter.attemptsPrompt(guessCount);
    }
  
  private static int overMaxLoop(int max, Prompter prompter){
    int guess = 0;
    do {
      guess = prompter.oobPrompt(max);
    } while(guess > max);
    return guess;
  }
}