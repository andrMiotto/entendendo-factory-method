package org.example.concreteCreators;

import org.example.concreteProducts.Goblin;
import org.example.creator.InimigoFactory;
import org.example.product.Inimigo;

public class GoblinFactory extends InimigoFactory {
    @Override
    public Inimigo criarInimigo() {
        return new Goblin();
    }
}
