/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int suma;
        suma = 0;
        System.out.println("Ingrese el multiplicando");
        n = entrada.nextInt();
        System.out.println("Ingrese el multiplicador");
        m = entrada.nextInt();
        while (m >= 1) {
            if (m % 2 == 1) {
                suma = suma + n;
            }
            m = m / 2;
            n = n + n;
        }
        System.out.println(suma);
    }

}
