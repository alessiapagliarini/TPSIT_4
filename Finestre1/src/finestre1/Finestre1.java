/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;

import java.util.Scanner;

/**
 *
 * @author studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Finestra f;
        int n, x;
        int p1 = 0, p2= 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Quante finestre vuoi stampare? ");
            n = input.nextInt();
        }while((n<0)||(n>20));
        for (x = 0; x < n; x++) {
            f = new Finestra();
            f.testo.setText("Sono la finestra " + (x + 1));
            f.setVisible(true);
            f.setLocation(p1 = p1 + 200, p2= p2+50 );
        }

    }
}
