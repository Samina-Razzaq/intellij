package practice.com;

public class Method151 {
    public static  int sum2D(int[][]array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
              sum=sum+array[i][j];
            }
        }
     return  sum;
    }
}
class Main151 extends Method151{

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(sum2D(a));
    }

}