import java.util.Scanner;
class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Reverse the string
        reverseString(chars);

        // Print reversed string
        System.out.print("Reversed string: ");
        System.out.println(chars);
        sc.close();
    }
}
