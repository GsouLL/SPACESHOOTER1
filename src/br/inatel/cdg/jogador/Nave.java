package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public class Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.tipoTiro = tipoTiro;
    }

    public class atirar(Asteroide ast) {

}
