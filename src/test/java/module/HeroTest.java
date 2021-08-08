package module;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void NewSuperHeroObjectGetsCorrectlyCreated_true() throws  Exception{
        Hero hero=setupNewSuperHero();
        assertEquals(true,hero instanceof Hero );
    }
    @Test
    public void SuperHeroInstantiatesWithName_true() throws  Exception {
        Hero hero=setupNewSuperHero();
        assertEquals("Vicky",hero.getName());
    }
    //helper methods
    public Hero setupNewSuperHero(){
        return new Hero("Vicky",23,"speed","rice");
    }
}