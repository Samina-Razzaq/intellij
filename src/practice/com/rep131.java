package practice.com;

public class rep131 {
    // print number at 3rd position
    static String thirdLetter(String s){
        String newStr="";
        for(int i=0; i<s.length(); i+=3){
            newStr+=s.charAt(i);
        }
        return newStr;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
