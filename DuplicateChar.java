public class DuplicateChar {
    
    public static void main(String args[]){

        char[] alphabets={'A','B','C','D','A','T','E','C'};
        
        for(int i =0; i<alphabets.length-1; i++)
        for(int j=i+1; j<alphabets.length; j++)
        
        if(alphabets[i]==alphabets[j])
        {
        System.out.println("Duplicate Element is:" +alphabets[i]);
        }
        }
        }
        
