package practice.com;

public class Main142 {
    public static void main(String[] args) {
        SyntaxTechnologies obj=new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        SyntaxTechnologies obj1=new SyntaxTechnologies();
        obj1.displayInfo();
        obj.displayInfo();
    }


}
class SyntaxTechnologies{
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    SyntaxTechnologies(){
    }
   void displayInfo(){
       System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
   }
}