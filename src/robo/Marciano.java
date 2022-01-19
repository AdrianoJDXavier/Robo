/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robo;

/**
 *
 * @author adriano
 */
public class Marciano {

    private String resposta;

    /**
     * @return the resposta
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Marciano() {
    }

    public String responda(String pergunta) {
        if (pergunta.trim().isEmpty()) {
            return "Não me incomode";
        } else {
            if (pergunta.toLowerCase().contains("eu")) {
                return "A responsabilidade é sua";
            } else if (!(pergunta.toUpperCase() == pergunta) && ("?".equals(pergunta.substring(pergunta.length() - 1)))) {
                return "Certamente";
            } else if (pergunta.toUpperCase() == pergunta && !("?".equals(pergunta.substring(pergunta.length() - 1)))) {
                return "Opa! Calma aí!";
            } else if ((pergunta.toUpperCase() == pergunta) && ("?".equals(pergunta.substring(pergunta.length() - 1)))) {
                return "Relaxa!";
            } else {
                return "Tudo bem, como quiser";
            }
        }
    }

}
