import java.util.HashMap;
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
        Map<String,Integer> wordCountMap = new HashMap<>();
        String[] words= sentence.split("\\s+");

        for (String word: words){
            word = word.replaceAll("[^a-zA-Z]","");
            word = word.toLowerCase();
            if (!word.isEmpty()) {
                if (wordCountMap.containsKey(word)) {
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }
        return wordCountMap;
    }
}
