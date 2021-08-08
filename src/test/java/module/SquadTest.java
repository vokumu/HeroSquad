package module;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws  Exception{
        Squad squad=setupNewSquad();
        assertEquals(true,squad instanceof Squad );
    }

    //helper methods
    public Squad setupNewSquad(){
        return new Squad(3,"X team","hunger");
    }
}