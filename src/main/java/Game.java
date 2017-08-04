import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.io.Console;
import java.util.ArrayList;



public class Game{

public String output="";
//public String letter;
public String guessWord;

public String GenerateWord(List<String> availableWords){
  Random randomWord = new Random();
  int myIndex = randomWord.nextInt(availableWords.size()); //picks a random number
  String guessWord=availableWords.get(myIndex);//store the picked word at index i in String guessWord
  return guessWord;//random word picked from our array


}
  public String wordCount(String guessWord){
    //String output="";
    for(int i=0;i<guessWord.length();i++){
      output=output+"-";
      }
    return output;

  }
public String[] splitPickedWord(String guessWord){
  String[] resultingSplit=guessWord.split("");
  return resultingSplit;

}
public String checkLetters(String[] resultingSplit, String letter){

  StringBuilder resultingWord=new StringBuilder();
  String[] splitOutput=output.split("");
  for(int i=0;i<guessWord.length();i++){
    if(splitOutput[i].equals("-")){
      if(resultingSplit[i].equals(letter)){
        //splitOutput[i]=letter;

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