import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class GameTest{
//test to determine whether a random word is chosen from the array list
@Test
public void generateARandomWord(){
Game thisGame=new Game();
List<String> availableWords= Arrays.asList("One", "Two", "Three", "Four");
String testWord=thisGame.GenerateWord(availableWords);
assertTrue(testWord, availableWords.contains(testWord));
}
//test to return dashes based on the word count of guessed word
@Test
public void returnTheNumberOfLetters(){
  Game thisGame=new Game();
  String expected="-------";
  assertEquals(expected, thisGame.wordCount("Moringa"));
}
//test if word is split into individual string characters
@Test
public void returnAnArrayOfSplitWords(){
  Game thisGame=new Game();
  String[] expected = {"c","a","r","o","l"};
  assertEquals(expected, thisGame.splitPickedWord("carol"));
}

// @Test
// public void checkLetters(){
//   Game thisGame=new Game();
//   String guessWord="One";
//   String expected = "-n-";
//   assertEquals(expected, thisGame.checkLetters("n"));
// }
}
