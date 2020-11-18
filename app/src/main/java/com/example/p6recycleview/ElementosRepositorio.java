package com.example.p6recycleview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Elemento 1", "dhhdshsfdh"));
        elementos.add(new Elemento("Elemento 2", "ehf"));
        elementos.add(new Elemento("Elemento 3", "dfh"));
        elementos.add(new Elemento("Elemento 4", "dfhd"));
    }

    List<Elemento> obtener(){
        return elementos;
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback){
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
