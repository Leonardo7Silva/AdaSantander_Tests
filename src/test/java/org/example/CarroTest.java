package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
    @Test
    public void deveIniciarDesigado() {
        // Given (Dado)
        Carro Carro = new Carro();
        // Then (Então)
        Assert.assertFalse(Carro.getLigado());
    }

    @Test
    public void deveIniciarComVelocidade0() {
        // Given (Dado)
        Carro Carro = new Carro();
        // Then (Então)
        Assert.assertEquals((Integer) 0, Carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        // Then (Então)
        Assert.assertTrue(Carro.getLigado() && Carro.getVelocidadeAtual() == 0);
    }

    @Test
    public void deveDesligarCorretamente(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        Carro.desligar();
        // Then (Então)
        Assert.assertTrue(!Carro.getLigado() && Carro.getVelocidadeAtual() == 0);
    }

    @Test
    public void deveAcelerarCorretamenteUmCarroLigado(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        Carro.acelerar(10);
        // Then (Então)
        Assert.assertEquals((Integer) 10, Carro.getVelocidadeAtual());
    }

    @Test
    public void deveFrearCorretamenteUmCarroAcelerado(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        Carro.acelerar(10);
        Carro.frear(10);
        // Then (Então)
        Assert.assertEquals( (Integer) 0, Carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveUltrapassarAVelocidadeMax(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        Carro.acelerar(1000);
        // Then (Então)
        Assert.assertEquals((Integer) 200, Carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveTerVelocidadeMenorQueZero(){
        // Given (Dado)
        Carro Carro = new Carro();
        // When (Quando)
        Carro.ligar();
        Carro.frear(1000);
        // Then (Então)
        Assert.assertEquals((Integer) 0, Carro.getVelocidadeAtual());
    }
}
