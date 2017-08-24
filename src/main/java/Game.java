import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.io.Console;
import java.util.ArrayList;


public class Game{
private String output="";
private String guessWord;


//setter methods for setting the private variables
public void setGuessWord(String userWord) {
  guessWord=userWord;
}

public void setOutput(String userOutput){
       output=userOutput;
     }
//Getter methods for returning variables
public String getGuessWord(){
  return guessWord;
}

public String getOutput(){
  return output;
}

//Function to generate random word based on the the array list index
public String GenerateWord(List<String> availableWords){
  Random randomWord = new Random();
  int myIndex = randomWord.nextInt(availableWords.size()); //picks a random number
  String guessWord=availableWords.get(myIndex);//store the picked word at index i in String guessWord
  return guessWord;//random word picked from our List

}
//function to split the rabdomly picked into dashes equivalent to the string size

  public String wordCount(String guessWord){
    //String output="";
    for(int i=0;i<guessWord.length();i++){
      output=output+"-";
      }
    return output;

  }
//split the randomnly generated word
public String[] splitPickedWord(String guessWord){
  String[] resultingSplit=guessWord.split("");
  return resultingSplit;

}
//function(with a for loop) to compare every input letter with the actual letters of the word
//and replace the guessword dashes with the letter if correct
public String checkLetters(String[] resultingSplit, String letter){

  StringBuilder resultingWord=new StringBuilder();
  String[] splitOutput=output.split("");
  for(int i=0;i<guessWord.length();i++){
    if(splitOutput[i].equals("-")){
      if(resultingSplit[i].equals(letter)){
        resultingWord.append(letter);
      }else{
        resultingWord.append("-");
      }
    }else {
        resultingWord.append(splitOutput[i]);
      }
    }
    output =resultingWord.toString();
    return output;
    }
 }
