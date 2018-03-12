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
public class Zad3 {
    
    public static void main(String[] args) {
        int i,x;
        boolean y = false;
        int[] tab = new int[10];
        Scanner wczytaj = new Scanner(System.in);
        
        for(i=0;i<10;i++){
            System.out.print("Podaj liczbe: ");
            tab[i] = wczytaj.nextInt();
        }
        
        System.out.println("Wybierz opcję:");
        System.out.println("1 - elementy tablicy od pierwszego do ostatniego indeksu.");
        System.out.println("2 - elementy od ostatniego do pierwszego indeksu.");
        System.out.println("3 - elementy o nieparzystych indeksach tablicy.");
        System.out.println("4 - elementy o parzystych indeksach tablicy.");
        
        do{
            System.out.print("Wybierz opcje: ");
            x = wczytaj.nextInt();
            if(x==1){
                y=true;
                for(i=0;i<10;i++){
                    System.out.print(tab[i]+" ");
                }
            }
            else if(x==2){
                y=true;
                for(i=9;i>=0;i--){
                    System.out.print(tab[i]+" ");
                }
            }
            else if(x==3){
                y=true;
                for(i=1;i<10;i=i+2){
                    System.out.print(tab[i]+" ");
                }
            }
            else if(x==4){
                y=true;
                for(i=0;i<10;i=i+2){
                    System.out.print(tab[i]+" ");
                }
            }
            else
                y=false;
        }
        while(y!=true);


        

    }
}
