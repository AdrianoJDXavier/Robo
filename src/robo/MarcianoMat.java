/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robo;

/**
 *
 * @author adriano
 */
public class MarcianoMat extends Marciano {

    public float responda(String pergunta, float a, float b) {
        if (null == pergunta) {
            return 0;
        } else {
            switch (pergunta) {
                case "some":
                    return a + b;
                case "subtraia":
                    return a - b;
                case "multiplique":
                    return a * b;
                case "divida":
                    return a / b;
                default:
                    return 0;
            }
        }
    }

}
