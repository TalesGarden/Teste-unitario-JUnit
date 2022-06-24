package com.digitalinovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioExcecaoTransferencia(){
        Transferencia transferencia = new Transferencia();


        //Espera que uma excessão seja lançada
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferencia.transfere(-5));

        //Não espera receber uma excessão
        Assertions.assertDoesNotThrow(() -> transferencia.transfere(20));
    }
}
