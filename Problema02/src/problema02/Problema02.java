/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador;
        contador = 1;
        System.out.println("Ingrese el valor de n");
        n = entrada.nextInt();
        if (n>0 && n%2 == 0){
            while (contador <= n){
            System.out.println(contador);
            contador = contador + 1;
            }
        }else{
            System.out.println("Error al presentar, ya que el valor no es"
                    + " positivo o par");
        }
    }
    
}
