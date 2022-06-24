package com.digitalinovationone.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EscolhendoOrdemTeste {


    @DisplayName("A")
    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Order(1)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Order(2)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }


}
