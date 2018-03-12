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
public class Zad4 {
    
        public static void main(String[] args) {
            int i,menu,suma=0,iloczyn=1,min,max;
            float srednia;
            int[] tab = new int[10];
            Scanner wczytaj = new Scanner(System.in);
            for(i=0;i<tab.length;i++){
                System.out.print("Podaj liczbe: ");
                tab[i] = wczytaj.nextInt();
            }
            
            System.out.println("1 - suma elementów tablicy");
            System.out.println("2 - iloczyn elementów tablicy");
            System.out.println("3 - wartość średnią");
            System.out.println("4 - wartość minimalną");
            System.out.println("5 - wartość maksymalną");
            System.out.print("Wybierz opcje: ");
            menu = wczytaj.nextInt();
            switch(menu){
                case 1:
                    for(i=0;i<tab.length;i++)
                        suma=suma+tab[i];
                    System.out.println("Suma elementow wynosi: "+suma);
                    break;
                case 2:
                    for(i=0;i<tab.length;i++)
                        iloczyn=iloczyn*tab[i];
                    System.out.println("Iloczyn elementow wynosi: "+iloczyn);
                    break;
                case 3:
                    for(i=0;i<tab.length;i++)
                       suma=suma+tab[i];
                    srednia=suma/tab.length;
                    System.out.println("Srednia elementow wynosi: "+srednia);
                    break;
                case 4:
                    min=tab[0];
                    for(i=1;i<tab.length;i++){
                        if(tab[i]<min)
                            min=tab[i];
                    }
                    System.out.println("Wartosc minimalna to: "+min);
                    break;
                case 5:
                    max=tab[0];
                    for(i=1;i<tab.length;i++){
                        if(tab[i]>max)
                            max=tab[i];
                    }
                    System.out.println("Wartosc maksymalna to: "+max);
                    break;
                default:
                    System.out.println("brak opcji.");
                    break;
            }
    }
}
