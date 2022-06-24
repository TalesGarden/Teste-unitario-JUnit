package com.digitalinovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Tales", LocalDate.of(1994, 7, 2));
        Assertions.assertEquals(27, pessoa.getIdade());
    }

    @Test
    void validaMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Tales", LocalDate.of(1994, 7, 2));
        Pessoa pessoa2 = new Pessoa("Marcos", LocalDate.of(2005, 7, 2));

        Assertions.assertTrue(pessoa.eMaiorDeIdade());
        Assertions.assertFalse(pessoa2.eMaiorDeIdade());


    }

    //Assumptions
    @Test
    void validarAlgoNoUsuarioTales(){
        Assumptions.assumeTrue("root".equalsIgnoreCase(System.getenv("User")));
        Assertions.assertEquals(5 + 5, 10);
    }

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "Tales")
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Tales")
    void validarAlgoNoUsuarioTalesMetodo2(){
        Assertions.assertEquals(5 + 5, 10);
    }

    //Habilita apenas no OS windows
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testaOS(){
        Assertions.assertEquals(5 + 5, 10);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void testaJAVA(){
        Assertions.assertEquals(5 + 5, 10);
    }


}
