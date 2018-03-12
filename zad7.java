/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;
import java.util.Scanner;
/**
 *
 * @author Mateusz
 */
public class zad7 {
    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        int x, i, srt = 1, y;
        System.out.print("ile liczb : ");
        x = wczytaj.nextInt();
        int[] tab = new int[x];

        for (i = 0; i < tab.length; i++) {
            System.out.print("Podaj liczbe: ");
            tab[i] = wczytaj.nextInt();
        }
        while (srt != 0) {
            srt = 0;
            for (i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    y = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = y;
                    srt++;
                }
            }
        }
        for (i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}
