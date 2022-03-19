package practice.com;

public class Main122 {
    String nameCountry;
    String capital;
    int population;

    void printInfo(){
        System.out.println("The capital of "+nameCountry+"  is "+ capital+ " and population is "+population);

    }

    public static void main(String[] args) {
        Main122 obj1=new Main122();
        obj1.nameCountry="USA";
        obj1.capital="Washington DC";
        obj1.population=330000000;

        Main122 obj2=new Main122();
        obj2.nameCountry="Kazakhstan";
        obj2.capital="Astana";
        obj2.population=18500000;

        obj1.printInfo();
        obj2.printInfo();

    }
}
