package org.example.concreteProducts;

import org.example.product.Inimigo;

public class Goblin implements Inimigo {


    @Override
    public void atacar() {
        System.out.println("Saqueando!!!");
    }
}
