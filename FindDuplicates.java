public class FindDuplicates {
    public static void main(String[] args) {
        String[] array = {"abcbcac"};
        StringBuffer array = new StringBuffer("abcbcac");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                    
                    
                   
                }
            }
        }
    }
}
