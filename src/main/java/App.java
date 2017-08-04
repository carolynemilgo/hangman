import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

  public class App {
  public static void main(String[] args) {
    List<String> availableWords= Arrays.asList("One", "Carol", "Three", "Four");
    Game thisGame=new Game();
    String myWord=thisGame.GenerateWord(availableWords);
    thisGame.guessWord=myWord;
    thisGame.output=thisGame.wordCount(myWord);//returns dashes
    String myAnswer="";
    String[] splitWord=thisGame.splitPickedWord(myWord);
    Console myConsole=System.console();
    Boolean dead=false;
    Integer maxLives=6;

    do
    {
      System.out.println("The dashes below represent the length of the word. Guess random words to fill up the dashes");
      System.out.println(thisGame.output);
      System.out.println("Enter a letter to replace another dash");
      String letter=myConsole.readLine();
      myAnswer=thisGame.checkLetters(splitWord, letter);
      System.out.println(myAnswer);
      maxLives=maxLives-1;
      if(maxLives==0){
        dead=true;
      }
    }

    while(!myWord.equals(myAnswer)&&!dead);
    if (dead){
      System.out.println("Sorry, you were hanged before you could finish guessing");
    }
    System.out.println("Game over");
}

}
