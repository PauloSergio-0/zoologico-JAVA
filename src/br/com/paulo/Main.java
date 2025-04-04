package br.com.paulo;

import br.com.paulo.animais.Leao;
import br.com.paulo.animais.Passaro;
import br.com.paulo.animais.Peixe;
import br.com.paulo.interfaceanimal.Animal;

import java.util.ArrayList;

public class Main {
    private static final ArrayList<Animal> animalLista = new ArrayList<>();

    public static void main(String[] args) {
        Peixe tilapia = new Peixe();
        animalLista.add(tilapia);

        Leao leao = new Leao();
        animalLista.add(leao);

        Passaro sabia = new Passaro();
        animalLista.add(sabia);

        exibirSomDosAnimais();
        movimentarAnimal();


    }

    private static void exibirSomDosAnimais(){
        for(Animal animal: animalLista){
            animal.fazerSom();
        }
    }

    private static void movimentarAnimal(){
        for(Animal animal: animalLista){
            animal.movimentar();
        }
    }
}
