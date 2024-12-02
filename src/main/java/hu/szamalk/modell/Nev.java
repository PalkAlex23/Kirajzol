package hu.szamalk.modell;

import java.util.Arrays;

public class Nev {
    private char[][] tomb;
    private char jel;

    public Nev(char jel) {
        this.tomb = new char[4][5];
        this.jel = jel;
    }

    public char[][] mutat() {
        return new char[4][5];
    }

    public int jelekSzamaSorban(int sor) {
        int db = 0;
        for (int i = 0; i <= 4; i++) {
            if(tomb[sor][i] == jel) {
                db++;
            }
        }
        return db;
    }

    public boolean teliSor(int sor) {
        int i = 0;
        boolean teli = true;
        /*
        while(i < 4 && teli) {
            if(tomb[sor][i] == " ") {
                teli = false;
            }
            i++;
        }
        */
        return teli;
    }

    public int teliSorDb() {
        int db = 0;
        for (int i = 0; i < 5; i++) {
            if(teliSor(i)) {
                db++;
            }
        }
        return db;
    }

    public static void fajlbaIr() {
        for(int i = 0; i < 100; i++) {
            System.out.println("eee");
        }
    }

    @Override
    public String toString() {
        return "Nev{" +
                "tomb=" + Arrays.toString(tomb) +
                '}';
    }
}
