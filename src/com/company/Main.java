package com.company;
enum Figures {
    kwadrat, prostokat, kolo, trapez, romb, trojkat, owal, szesciokat
}

public class Main {
    public static void main(String[] args) {

        Figures fg;
        Figures allFigures[] = Figures.values();
        for (Figures fig : allFigures) System.out.println(fig+" "+fig.ordinal());
        fg = Figures.romb;
        System.out.println("wartosc fg: "+ fg);
    }
}
