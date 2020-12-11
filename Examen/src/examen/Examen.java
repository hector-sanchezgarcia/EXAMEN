/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author DAM126
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int select;
        do {
            System.out.println("|----------MENU----------|");
            System.out.println("| 1.Horas --> Segundos   |");
            System.out.println("| 2.Kilometros --> metros|");
            System.out.println("| 3.Salir                |");
            System.out.println("|------------------------|");
            System.out.println("| Selecciona opcion:     |");
            select = teclado.nextInt();
            System.out.println("|------------------------|");
            switch (select) {
                case 1:   
                    System.out.println("Horas:");
                    int horas = teclado.nextInt();
                    System.out.println((horas*3600) + " segundos");
                    break;
                case 2:   
                    System.out.println("Km:");
                    int km = teclado.nextInt();
                    System.out.println((km*1000) + " metros");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (select != 3);
        
    }
    
}
