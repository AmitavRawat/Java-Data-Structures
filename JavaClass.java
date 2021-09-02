import java.util.ArrayList;

public class JavaClass {
    public static void main(String[] args) {
        /*
        //creates new array of 10 spaces all 0
        int[] arr = new int[10];

        //sets each position in the array to i value 0-9
        for(int i=0; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[2]=9;

        //prints the array
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        

        //initializes 2D array of all 0 (row x column)
        int[][] twoD_arr = new int [3][4];
        
        //sets the 2d array to be 0-3 across 
        for (int i=0; i < twoD_arr.length; i++) { 
            for (int j = 0; j < twoD_arr[i].length; j++) {
                twoD_arr[i][j]= j;
            }
        }
        //twoD_arr[0][1] = 2;

        //prints every element in 2D array (left to right) 
        for (int i=0; i < twoD_arr.length; i++) { 
            for (int j = 0; j < twoD_arr[i].length; j++) {
                System.out.println(twoD_arr[i][j]);
            }
        }
        */

        ArrayList<String> family = new ArrayList<String>();
        family.add("Mom");
        family.add("Dad");
        family.add("Son");
        family.add("Daughter");
        System.out.println(family); // [Mom, Dad, Son, Daughter]
        //cars.get(0);
        family.set(3, "Girl");
        System.out.println(family); // [Mom, Dad, Son, Girl]
        family.remove("Dad");
        System.out.println(family); // [Mom, Son, Girl]
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0; i<10; i++) {
            
        }


        for(int i=0; i<num.size(); i++) {
            
        }


    }
}