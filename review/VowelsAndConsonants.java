//count vowels and consonants
//importing scanner class
import java.util.Scanner;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        //creating scanner object
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        countVowelAndConsonant(input);
        //closing input
        sc.close();
    }
    public static void countVowelAndConsonant(String input)
    {
        int len=input.length();
        int vowels=0;
        int consonants=0;
        for(int i=0; i<len; i++)
        {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else{
            consonants++;
            }
        }
        System.out.println("Vowels count:"+vowels);
        System.out.println("Consonants count:"+consonants);

    }
}



