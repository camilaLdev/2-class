/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NewClass {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a=0;
    int b=0;
     System.out.println(" informe o valro de A");
        a = entrada.nextInt();
     System.out.println(" informe o valor de B");
       b = entrada.nextInt();
     System.out.println(" informe o código, 3 , 4 ou 5");
        int codigo = entrada.nextInt();
        switch (codigo){
            
            case 3:
            System.out.println(a=a+b);
                System.out.println(a=a+(a*20)/100);
                System.out.println(" valor de a+ b + 20% "+a);
            
            break;
            case 4: 
                b= b-a;
                b=b+(b*20)/100;
                System.out.println(" b-a mais 20% ="+ b);
                break;
                   
            case 5:
               a= a+a;
               a= a-(a*5)/100;
                System.out.println(" valor de a + a - 5% ="+a);
                
                break;
           default:
               System.out.println("Código inexistente");
        }  
        }
}

