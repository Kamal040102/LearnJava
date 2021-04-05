package Lectures;

public class array{
    public static void main(String[] args) {
        // // Way:1 of initializing, declaring and executing array
        // int [] arr1 = new int [5];                    // Reference and memory Allocation     ==>Initialization
        // arr1 [0] = 1;
        // arr1 [1] = 2;
        // arr1 [2] = 3;                                 // Declaration
        // arr1 [3] = 4;
        // arr1 [4] = 5;
        // System.out.println(arr1[3]);                  // Execution


        // // Way:2 of initializing, declaring and executing array
        // int [] arr2;                     //=====> Reference
        // arr2 = new int [5];              //=====> Memory Allocation
        // arr2 [0] = 1;                    
        // arr2 [1] = 2;
        // arr2 [2] = 3;                    //=====> Declaration
        // arr2 [3] = 4;
        // arr2 [4] = 5;

        // System.out.println(arr2[2]);        //======> Execution


        // // Way:3 of initializing, declaring and executing array
        // int [] arr3 = {1,2,3,4,5};          // Reference & Declartion {Memory Allocation is automatic}
        // System.out.println(arr3[4]);        // Execution

      //  int [] arr = {78,99,45,32,85,25,65};
        String [] arr = {"Kamal", "Gulabo", "Movika", "Miss Ajib", "Mr Ajib"};
        // System.out.println(arr.length);

         // Printing of array using naive method
        /*
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
        */

        // Printing of array using for loop
        /* for(int i = 0; i <= arr.length - 1; i++){
             System.out.println(arr[i]);}
        */

        // Printing of array using for loop in reverse order
        /*
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        */

        // Printing of array using for each loop 
        /*
        for(String elements : arr){
            System.out.println(elements);
        }
        */
    }
}