package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
       /* File java=new JavaFile();
        java.openFile();
        File word=new WordFile();
        word.openFile();
        new PdfFile().openFile();*/
        File[] file = {new WordFile(), new JavaFile(), new PdfFile()};
        for (File f : file) {
            f.openFile();
            f.editFile();
            f.closeFile();
            //  in polymorphism we can only call those methods present in parent and child
        }
        int i = 0;
        while (i < file.length) {
            file[i].openFile();
            file[i].editFile();
            file[i].closeFile();
            i++;
        }

    }
}