package practice.com;


//mix string
public class Main128 {

    static String mixString(String s1, String s2){

        // to store the final string
        StringBuilder result=new StringBuilder();
// for every index in the strings
        for(int i=0; i<s1.length() || i< s2.length(); i++){
//first choose the ith character of s1
            if(i<s1.length()){
                result.append(s1.charAt(i));
 //choose the  ith character of s2 and append with result
            } if(i<s1.length()){
                result.append(s2.charAt(i));
            }
        }
        //convert stringBuilder to string again
        return result.toString();
    }


    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
