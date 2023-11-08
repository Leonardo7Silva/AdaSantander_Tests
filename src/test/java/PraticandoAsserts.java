import org.example.model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class PraticandoAsserts {
    @Test
    public void praticandoAssertTrue(){
        Boolean aprovado = true;
        Assert.assertTrue(aprovado);
    }

    @Test
    public void praticandoAssertFalse(){
        Boolean aprovado = false;
        Assert.assertFalse(aprovado);
    }

    @Test
    public void praticandoAssertNull(){
        String nome = null;
        Assert.assertNull(nome);
    }

    @Test
    public void praticandoAssertNotNull(){
        String nome = "Leo";
        Assert.assertNotNull(nome);
    }

    @Test
    public void praticandoAssertArraysEquals(){
        int[] numeros1 = new int[]{1,2,3};
        int[] numeros2 = new int[]{1,2,3};
        Assert.assertArrayEquals(numeros2, numeros1);
    }

    @Test
    public void praticandoAssertEquals_primitivos(){
        int a = 1;
        int b = 1;
        Assert.assertEquals(a,b);

        char a1 = 'a';
        char a2 = 'a';
        Assert.assertEquals(a1, a2);

        Integer c = 1;
        Integer d = 1;
        Assert.assertEquals(c,d);
    }

    @Test
    public void praticandoAssertEquals_objetos(){
        Carro carro1 = new Carro("azul", "Fiat", "Uno");
        Carro carro2 = new Carro("azul", "Fiat", "Uno");

        Assert.assertEquals(carro1, carro2);
    }

    @Test
    public void praticandoAssertEquals_detalheString(){
        String nome = "Leo";
        String nome2 = new String("Leo");

        //[Leo(nome)][Leo(nome2)][][]

        //Assert.assertTrue(nome == nome2);
        Assert.assertEquals(nome, nome2);
    }

    @Test
    public void praticandoAssertNotEquals(){
        int a = 1;
        int b = 2;

        Assert.assertNotEquals(a, b);
    }

    @Test
    public void praticandoAssertSame(){
        Carro carro = new Carro();
        Carro carro1 = carro;

        Assert.assertSame(carro, carro1);
    }

    @Test
    public void praticandoAssertNotSame(){
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        Assert.assertNotSame(carro, carro1);
    }
}
