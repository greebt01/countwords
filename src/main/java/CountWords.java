import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter text whose words you want to count");
        String targetString=scanner.nextLine();
        CountWords.wordCountTokenizer(targetString);
//        CountWords.stringWordCount(targetString);

//        CountWords.wordCountUsingSplit("count words using   split  ");
    }

    public static void stringWordCount(String targetString){
        int count = 1;
        for(int i = 0; i < targetString.length() - 1; i++){
            // If the current char is space and next char is not a space
            // then increment count
            if((targetString.charAt(i) == ' ') && (targetString.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Count of words in String - "  + count);
    }

    // This method uses split method to count words
    public static void wordCountUsingSplit(String str){
        // regex "\\s+" matches any number of white spaces
        String[] test = str.trim().split("\\s+");
        System.out.println("Count of words in String - "  + test.length);
    }

    public static void wordCountTokenizer(String targetString){
        if (targetString==null) {
            System.out.println("0");
        }
        StringTokenizer tokenCount= new StringTokenizer(targetString);
        System.out.println("The number of words is: "+tokenCount.countTokens());
    }
}
