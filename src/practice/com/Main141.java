package practice.com;

public class Main141 {// max value
    public static int maxValue(int [] arr){
        int maximunValue=arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i]>maximunValue){
                maximunValue=arr[i];
            }
        }
       return maximunValue ;
    }

    public static void main(String[] args) {

        int []arr={5, 12, -3, 7, 3,22};
        System.out.println(maxValue(arr));
    }
}
