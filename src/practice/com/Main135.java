package practice.com;

public class Main135 {
    static String surround(String s, String search_term){
      String newstr= "";
              search_term.replaceAll("[search-term]", "(search-term)");
   return newstr; }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
