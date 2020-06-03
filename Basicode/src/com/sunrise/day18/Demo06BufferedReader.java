package com.sunrise.day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo06BufferedReader {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("E:\\test\\BufferedWriter.txt");
            br = new BufferedReader(fr);
            String s = null;
            try {
/*                s = br.readLine();
                System.out.println(s);
                s = br.readLine();
                System.out.println(s);
                s = br.readLine();
                System.out.println(s);*/
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
