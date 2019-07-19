package com.ch.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileio {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("file.txt");
        System.out.println(file.getAbsoluteFile());
        File onefile=new File("e:/a.txt");
        String path;
        FileInputStream fileinput=new FileInputStream("e:/a.txt");
        System.out.println(fileinput);
        try {
            System.out.println(onefile.createNewFile());
            path = file.getCanonicalPath();
            System.out.println(file.listRoots());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
