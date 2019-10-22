package com.zebc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Level {

    public String[][] wall () {

        FileReader fr = null;
        try {
            fr = new FileReader("D:/Project/Java/pacman/resources/Level1string.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner (fr);
        String[][] field = new String [31][28];
        for (int i=0; i<31; i++) {
            for (int j=0; j<28; j++) {
                field[i][j] = scan.next();
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        scan.close();
        return field;
    }


}
