package playersTest;

import enums.HealingType;
import enums.TreasureType;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;


    @Before
    public void before(){
        cleric = new Cleric("Alfred", 30, "Healer", HealingType.BANDAID);

    }

    @Test
    public void hasName(){
        assertEquals("Alfred", cleric.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(30, cleric.getHealth());
    }

    @Test
    public void hasType(){
        assertEquals("Healer", cleric.getType());

    }

    @Test
    public void hasItems(){
        assertEquals(0, cleric.countItems());
    }

    @Test
    public void canSetHealth(){
        cleric.setHealth(50);
        assertEquals(50, cleric.getHealth());
    }

    @Test
    public void canHeal(){
        cleric.heal(cleric);
        assertEquals(40, cleric.getHealth());
    }

    @Test
    public void cantDefend(){
        assertEquals(20, cleric.defend(10));
    }

    @Test
    public void canTakeDamage(){
        assertEquals(10, cleric.takeDamage(20));
    }

    @Test
    public void canAddTreasure(){
        cleric.addTreasure(TreasureType.BREAD);
        assertEquals(1, cleric.countItems());
    }




}
