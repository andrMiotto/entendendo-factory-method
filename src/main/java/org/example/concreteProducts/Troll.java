package org.example.concreteProducts;

import org.example.product.Inimigo;

public class Troll implements Inimigo {


    @Override
    public void atacar() {
        System.out.println("Mordendo!!!");
    }
}
