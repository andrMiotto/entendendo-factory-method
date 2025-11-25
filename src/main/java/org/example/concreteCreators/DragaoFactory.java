package org.example.concreteCreators;

import org.example.concreteProducts.Dragao;
import org.example.creator.InimigoFactory;
import org.example.product.Inimigo;

public class DragaoFactory extends InimigoFactory {

    @Override
    public Inimigo criarInimigo() {
        return new Dragao();
    }
}
