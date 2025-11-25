package org.example.concreteCreators;

import org.example.concreteProducts.Goblin;
import org.example.concreteProducts.Troll;
import org.example.creator.InimigoFactory;
import org.example.product.Inimigo;

public class TrollFactory extends InimigoFactory {
    @Override
    public Inimigo criarInimigo() {
        return new Troll();
    }
}
