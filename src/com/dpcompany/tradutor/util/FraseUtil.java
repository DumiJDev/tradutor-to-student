package com.dpcompany.tradutor.util;

import com.dpcompany.tradutor.model.Frase;
import com.dpcompany.tradutor.model.Palavra;

import java.util.Arrays;
import java.util.List;

public class FraseUtil {

    public Iterable<Palavra> dividePalavra(Frase frase){
        return (Iterable<Palavra>) Arrays.stream(frase.getValor().replaceAll(", ", "").split(";")).iterator();
    }
}
