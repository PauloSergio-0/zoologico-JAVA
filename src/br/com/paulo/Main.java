package br.com.paulo;

import br.com.paulo.animais.Leao;
import br.com.paulo.animais.Passaro;
import br.com.paulo.animais.Peixe;

public class Main {
    public static void main(String[] args) {
        Peixe tilapia = new Peixe();
        Leao leao = new Leao();
        Passaro sabia = new Passaro();

        tilapia.fazerSom();
        tilapia.movimentar();


        leao.fazerSom();
        leao.movimentar();

        sabia.fazerSom();
        sabia.movimentar();


    }
}
