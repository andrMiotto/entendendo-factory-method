package org.example.creator;

import org.example.product.Inimigo;

public abstract class InimigoFactory {


    public abstract Inimigo criarInimigo();


    public void atacarInimigo(){
        Inimigo inimigo = criarInimigo();
        inimigo.atacar();


    }


}
