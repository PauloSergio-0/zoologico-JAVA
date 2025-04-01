package br.com.paulo.animais;

import br.com.paulo.interfaceanimal.Animal;

public class Peixe implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("Bolhas");
    }

    @Override
    public void movimentar() {
        System.out.println("Nadar");
    }
}
