package com.digitalinovationone.junit;

public class Transferencia {

    public void transfere (int valor)
    {
        if (valor <= 0) throw new IllegalArgumentException("VAlor deve ser maior que 0");
    }
}
