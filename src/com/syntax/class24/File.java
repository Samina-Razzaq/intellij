package com.syntax.class24;

public abstract class File {
    /*Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract. Create 3 subclasses:
      JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text,
     to open .doc file we need Microsoft word to be installed etc
     */

   abstract void openFile();
    void editFile(){
        System.out.println("You can edit the file");
    }
    void closeFile(){
        System.out.println("Close the file");
    }
}
class JavaFile extends File {

    @Override
    void openFile() {
        System.out.println("click note pad  to open a java file");
    }
}
class WordFile extends File{
    @Override
    void openFile(){
        System.out.println("Microsoft word need to be installed to view this file");
    }
}

class PdfFile extends File{
    @Override
    void openFile(){
        System.out.println("click on adobe reader to open PDF file");
    }

}