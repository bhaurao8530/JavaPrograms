import java.util.Arrays;
public class CommonInt{

public static void main(String args[]){

int[] array1= {1,2,3,4,5,6,7};
int[] array2={7,8,9,10,11,12,13,14};

System.out.println("Array1:"+ Arrays.toString(array1));
System.out.println("Array2:"+Arrays.toString(array2));

for(int i =0; i<array1.length; i++){
for(int j=0; j<array2.length; j++){

if(array1[i]==array2[j]){
System.out.println("Common Element is:" +(array1[i]));
}
}
}
}
}