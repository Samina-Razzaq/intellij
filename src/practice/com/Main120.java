package practice.com;

public class Main120 {
    int year;
    String schoolName;
    String batch;

    public static void main(String[] args) {
        Main120 obj = new Main120();
        obj.year = 2021;
        obj.schoolName = "Syntax Technologies";
        obj.batch = "12";
        System.out.println("I am a student of batch " + obj.batch + " studying at " + obj.schoolName + " in the year of " + obj.year);

    }
}