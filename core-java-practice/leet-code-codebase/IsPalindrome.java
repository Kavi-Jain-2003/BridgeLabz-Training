import java.util.Scanner;
class isPalindrome {
    public static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=input.nextLine();
        if(checkPalindrome(text))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
        input.close();
    }
}
