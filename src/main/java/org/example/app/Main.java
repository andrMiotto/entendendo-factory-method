package org.example.app;

import org.example.concreteCreators.DragaoFactory;
import org.example.concreteCreators.GoblinFactory;
import org.example.concreteCreators.TrollFactory;
import org.example.creator.InimigoFactory;

public class Main {
    public static void main(String[] args) {

        InimigoFactory factory;


        factory = new DragaoFactory();
        factory.atacarInimigo();

        factory = new GoblinFactory();
        factory.atacarInimigo();

        factory = new TrollFactory();
        factory.atacarInimigo();

    }
}