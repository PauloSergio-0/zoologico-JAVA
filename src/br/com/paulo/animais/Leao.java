package br.com.paulo.animais;

import br.com.paulo.interfaceanimal.Animal;

public class Leao implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("Rugido");
    }

    @Override
    public void movimentar() {
        System.out.println("Andar");
    }
}
