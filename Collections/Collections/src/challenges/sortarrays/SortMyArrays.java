package challenges.sortarrays;

import java.util.Arrays;

public class SortMyArrays {
    public static void main(String[] args) {

        int[] numbers= new int[]{6,3,1,2,7,5,4,8,9};

        //Arrays.sort(numbers);

        sortArray(numbers);
        printArray(numbers);

        /*
        OUTPUT 
        
        123456789

        */
        
    }

    public static void sortArray(int[] numbers){
        int idxAux=0;
        int numAux1=0;
        int numAux2=0;
        for(int i=0; i<numbers.length; i++){
            idxAux=i;
            for(int j=i+1; j<numbers.length-1; j++){              
                if(numbers[j]<numbers[idxAux]){
                    idxAux=j;
                }
            }
            numAux1=numbers[i];
            numAux2=numbers[idxAux];
            numbers[idxAux]=numAux1;
            numbers[i]=numAux2;
        }
    }

public static void printArray(int[] myArray){
    for(int e:myArray){
        System.out.print(e);
    }
}

}