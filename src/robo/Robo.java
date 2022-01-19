/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robo;

import java.util.Scanner;

/**
 *
 * @author adriano
 */
public class Robo {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String opcao = "0";
        while (opcao != "5") {
            System.out.println("\n----->Digite sua opção<-----\n----->1 - Robô Marciano\n----->2 - Robô Matemático\n----->3 - Robô Premium\n----->4 - SAIR");
            opcao = sc.nextLine().toUpperCase();
            if (opcao.matches("[A-Z]*")) {
                System.out.println("\nComando inválido, tente novamente por favor");
            } else {
                int opcao2 = Integer.parseInt(opcao);
                if (opcao2 == 1) {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("\n----->Digite sua pergunta<-----");
                    String pergunta = sc1.nextLine();
                    Marciano marciano = new Marciano();
                    String resposta = marciano.responda(pergunta);
                    System.out.println(resposta);
                } else if (opcao2 == 2) {
                    System.out.println("\n----->Digite o calculo<-----");
                    Scanner sc2 = new Scanner(System.in);
                    String tipoCal = sc2.nextLine();
                    MarcianoMat roboMat = new MarcianoMat();
                    System.out.println("\n----->Digite o 1° número<-----");
                    Scanner sc3 = new Scanner(System.in);
                    int a = sc3.nextInt();
                    System.out.println("\n----->Digite o 2° número<-----");
                    Scanner sc4 = new Scanner(System.in);
                    int b = sc4.nextInt();
                    int calculo = roboMat.responda(tipoCal, a, b);
                    if (calculo != 0) {
                        System.out.println("Essa eu sei");
                        System.out.println(calculo);
                    } else {
                        System.out.println("Calculo incorreta");
                    }
                } else if (opcao2 == 3) {
                    System.out.println("\n----->Ola, vamos jogar?<-----");
                    Scanner sc1 = new Scanner(System.in);
                    String resposta = sc1.nextLine();
                    if ("agir".equals(resposta)) {
                        MarcianoPremium roboPremuim = new MarcianoPremium();
                        roboPremuim.adivinhacao();
                    }

                } else if (opcao2 > 4) {
                    System.out.println("opção invalida");
                } else if (opcao2 == 4) {
                    System.out.println("Programa encerrado");
                }
            }
        }
    }

}
