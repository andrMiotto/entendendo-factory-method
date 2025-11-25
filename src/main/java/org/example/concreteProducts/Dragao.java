package org.example.concreteProducts;

import org.example.product.Inimigo;

public class Dragao implements Inimigo {

    @Override
    public void atacar() {
        System.out.println("Cuspindo fogo!!!");
    }
}
