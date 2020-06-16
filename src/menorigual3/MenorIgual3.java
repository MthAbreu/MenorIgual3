/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menorigual3;

import java.util.Scanner;

public class MenorIgual3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite um número : ");
        int num = entrada.nextInt();
        
        if (num<=3)
        {
            System.out.println ("O número é menor ou igual a 3");
        }
        else
        {
            System.out.println ("O número é maior que 3");
        }
        
    }
    
}
