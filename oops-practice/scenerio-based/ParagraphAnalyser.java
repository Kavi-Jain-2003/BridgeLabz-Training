//Scenario: Create a program that analyzes a given paragraph of text.
//importing scanner class
import java.util.Scanner;

class ParagraphAnalyser {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
        System.out.println("Enter a paragraph:");
        String para = input.nextLine();
        //to check for edge case:empty para or space-only para
        if(para.trim().isEmpty())
        {
             System.out.println("Paragraph is empty or contains only spaces.");
             input.close();
            return;
        }
        wordCount(para);
        longestWord(para);
        System.out.println("Enter the word to be replaced:");
        String oldWord=input.nextLine();
        System.out.println("Enter the new word:");
        String newWord=input.nextLine();
        replaceOccurrences(para,oldWord,newWord);
        input.close();
    }

    public static void wordCount(String para) {
        String[] words=para.trim().split("\\s+");
        System.out.println("number of words in the paragraph:"+words.length);
    }
    //find longest word
    public static void longestWord(String para)
    {
        String[] words=para.split("\\s+");
        String longestWord=words[0];
        for(int i=1; i<words.length; i++)
        {
            if(words[i].length()>longestWord.length())
            {
                longestWord=words[i];
            }
        }
        System.out.println("Longest word:"+longestWord);
    }
    public static void replaceOccurrences(String para, String word, String newWord)
    {
        String[] paraWords=para.split(" ");
        String result="";
        for(int i=0; i<paraWords.length; i++)
        {
            if(paraWords[i].equalsIgnoreCase(word))
            {
                result+=newWord+" ";
            }
            else
            {
                result+=paraWords[i]+" ";
            }
        }
        System.out.println("paragraph after replacement:"+result.trim());

    }



}
