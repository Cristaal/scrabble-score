import java.io.Console;
import java.util.HashMap;
import java.util.Arrays;

public class ScrabbleScore {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Give me a word");
    String userWord = console.readLine();
    HashMap<String, Integer> wordValues = new HashMap<String, Integer>();
    wordValues.put("a", 1);
    wordValues.put("e", 1);
    wordValues.put("i", 1);
    wordValues.put("o", 1);
    wordValues.put("u", 1);
    wordValues.put("l", 1);
    wordValues.put("n", 1);
    wordValues.put("r", 1);
    wordValues.put("s", 1);
    wordValues.put("t", 1);

    char[] newUserArray = userWord.toCharArray();

    Integer finalScore = 0;
    for (char letter : newUserArray) {
      String str = Character.toString(letter);
      int i = wordValues.get(str).intValue();
      System.out.println(str);
      finalScore = finalScore + i;


    }


    System.out.println(finalScore);

  }
}
