package practice.com;

public class Main140 {
    //max length string

    static String maxLength(String [] arr){
         int index=0;
         int maximunLengthElement=arr[0].length();

         for(int i=1; i<arr.length; i++){
             if(arr[i].length()>maximunLengthElement){
                 index=i;
                 maximunLengthElement=arr[i].length();
             }
         }

   return arr[index]; }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));

    }
}
