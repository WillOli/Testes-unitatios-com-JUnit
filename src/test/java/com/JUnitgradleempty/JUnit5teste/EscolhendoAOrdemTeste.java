package com.JUnitgradleempty.JUnit5teste;


import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);

    }
    @Order(3)
    @Test

    void validaFluxoB() {
        Assertions.assertTrue(true);

    }
    @Order(2)
    @Test

    void validaFluxoC() {
        Assertions.assertTrue(true);

    }
    @Order(1)
    @Test

    void validaFluxoD() {
        Assertions.assertTrue(true);

    }
}



