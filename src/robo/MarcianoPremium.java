/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robo;

import java.util.Scanner;

/**
 *
 * @author adriano
 */
public class MarcianoPremium extends Marciano{
    
    public void adivinhacao() throws InterruptedException{
        System.out.println("\nOK Vamos jogar!");
        System.out.println("\nPense em um número qualquer!");
        Thread.sleep(4000);
        System.out.println("\nMultiplique por 5.");
        Thread.sleep(5000);
        System.out.println("\nSome 6 ao resultado.");
        Thread.sleep(5000);
        System.out.println("\nMultiplique essa soma por 4.");
        Thread.sleep(5000);
        System.out.println("\nSome 9.");
        Thread.sleep(5000);
        System.out.println("\n Multiplique a soma por 5.");
        Thread.sleep(5000);
        System.out.println("\n----->Qual o resultado do seu cálculo?<-----");
        Scanner sc1 = new Scanner(System.in);
        int calculo = sc1.nextInt();
        int resultado = calculo - 165;
        String resultado2 = Integer.toString(resultado);
        resultado2 = resultado2.substring(0, resultado2.length()-2);
        Thread.sleep(5000);
        System.out.println("\nVocê pensou no número ".concat(resultado2));
        
        System.out.println("\nImpressionante né?");
    }
}
