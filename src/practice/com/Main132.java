package practice.com;

public class Main132 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        //print the elements from new array

    }
    //create method reduce10 here
    static int[][] reduce10(int [][] array){
        for(int i=0; i<=array.length; i++){
            for(int j=0; j<=array.length; j++){
                System.out.print(j-10+" ");
            }
            System.out.println();
        }
        return array;
    }
}
