public class ConcatenateStringsUsingStringBuffer {
  public static void main(String[] args) {

        // String array
        String[] arr = {"Hello", "Java", "String", "Buffer"};

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        // Print result
        System.out.println("Concatenated String: " + sb.toString());
    }
}