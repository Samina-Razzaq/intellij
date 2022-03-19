package practice.com;

public class Main131 {

    static String thirdLetter(String s){

    for(int i=0; i<s.length(); i++){
        if(i%3==0){
            s+=s.charAt(i);
        }
    }
    return s;
}


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
