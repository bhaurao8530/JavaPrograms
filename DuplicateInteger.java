//import java.util.Arrays;

public class DuplicateInteger {

    public static void main(String[] args) {
        // Define the integer array
        int[] array = {1, 5, 8, 6, 6, 2, 9, 9, 3, 8, 6, 47};

       for(int i=0; i<array.length-1; i++)
       
       for(int j=i+1; j<array.length; j++)
       
       if(array[i]==array[j]){
       System.out.println("Duplicate Element is:"+array[j]);

      
    }

   }
    
}
