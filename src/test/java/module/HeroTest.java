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
    @Test
    public void SuperHeroInstantiatesWithAge_true() throws  Exception {
        Hero hero=setupNewSuperHero();
        assertEquals(23,hero.getAge());

    }
    @Test
    public void SuperHeroInstantiatesWithSpecialPowers_true() throws Exception {
        Hero hero=setupNewSuperHero();
        assertEquals("speed",hero.getSpecialPowers());
    }
    @Test
    public void SuperHeroInstantiatesWithWeakness_true() throws Exception{
        Hero hero=setupNewSuperHero();
        assertEquals("rice",hero.getWeakness());
    }
    //helper methods
    public Hero setupNewSuperHero(){
        return new Hero("Vicky",23,"speed","rice");
    }

}