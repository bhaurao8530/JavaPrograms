public class Array2 {
    public static void main(String[] args) {
        // Original string
        String originalString = "abcbacaa";

        // Removing the last 5 characters
        String resultString = originalString.substring(0, originalString.length() - 5);

        // Printing the result string
        System.out.println("Resulting string: " + resultString);

        // Finding the length of the resulting string
        int length = resultString.length();
        
        // Printing the length
        System.out.println("Length of resulting string: " + length);
    }
}

