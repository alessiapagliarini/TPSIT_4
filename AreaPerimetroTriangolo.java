/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;
/**
         *
         * @author studente
         */

public class AreaPerimetroTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altezza, lato1, lato2, p;
        float a;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Inserire lato 1: ");
        lato1 = input.nextInt();
        }while(lato1<0);
        do{
        System.out.println("Inserire lato 2: ");
        lato2 = input.nextInt();
        }while(lato2<0);
        do{
        System.out.println("Inserire base: ");
        base = input.nextInt();
        }while(base<0);
        do{
        System.out.println("Inserire altezza: ");
        altezza = input.nextInt();
        }while(altezza<0);
        if(lato1>lato2+base){
            System.out.println("Reinserire lato 1: ");
            lato1=input.nextInt();
        }
        if(base>lato2+lato1){
            System.out.println("Reinserire base: ");
            base=input.nextInt();
        }
        if(lato2>lato1+base){
            System.out.println("Reinserire lato 2: ");
            lato2=input.nextInt();
        }
        a = (base * altezza) / 2;
        p = base + lato1 + lato2;
        System.out.println("Area= " + a);
        System.out.println("Perimetro= " + p);
    }
}
