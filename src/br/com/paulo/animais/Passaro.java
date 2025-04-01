package br.com.paulo.animais;

import br.com.paulo.interfaceanimal.Animal;

public class Passaro implements Animal {

    @Override
    public void movimentar() {
        System.out.println("Voar");
    }

    @Override
    public void fazerSom() {
        System.out.println("Canto");
    }

}
