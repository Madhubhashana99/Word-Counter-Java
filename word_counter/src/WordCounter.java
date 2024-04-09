import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence = sc.nextLine();

        Scanner.close();

        Map<String,Integer> wordCountMap = countWords(sentence);
    }

    public static Map<String,Integer> countWords(String sentence){
        
    }
}
