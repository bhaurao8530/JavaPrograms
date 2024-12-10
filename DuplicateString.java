
public class DuplicateString {

    public static void main(String[] args) {
        // Define the integer array
       String[] array = {"abc","bca","abc","gds","gds","hhfk"};

       for(int i=0; i<array.length-1; i++)
       
       for(int j=i+1; j<array.length; j++)
       
       if(array[i] == array[j]){
       System.out.println("Duplicate Element is:"+array[i]);

      
    }

   }
    
}