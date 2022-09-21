import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ContaTeste {
    private Conta conta;

//    @Before
//    public void setUp() throws Exception{
//        Random numero = new Random();
//        conta = new Conta("Ana", 1 + numero.nextInt(9999), 500);
//    }

//    @After
//    public void tearDown() throws Exception{
//        conta = null;
//    }

    @Test
    public void test1() {
        Random numero = new Random();
        conta = new Conta("Ana", 1 + numero.nextInt(9999), 500);

        conta.sacar(100);
        conta.setSaques(2);

        conta.depositar(50);

        assertEquals(450, conta.getSaldo(), 0.0);
        assertEquals(2, conta.getSaques());
    }

    @Test
    public void test2() {
        Random numero = new Random();
        conta = new Conta("Ana", 1 + numero.nextInt(9999), 500);

        conta.depositar(100);

        assertEquals(600, conta.getSaldo(), 0.0);
    }
}