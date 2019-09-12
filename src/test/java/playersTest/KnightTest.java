package playersTest;

import behaviors.IAttack;
import behaviors.IDefend;
import enums.ArmourType;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Knight knight2;

    @Before
    public void before(){
        knight = new Knight("Matt", 100, "Warrior", WeaponType.AXE, ArmourType.SILVERSHIELD);
        knight2 = new Knight("Matt", 100, "Warrior", WeaponType.CROSSBOW, ArmourType.SILVERSHIELD);
    }

    @Test
    public void hasName(){
        assertEquals("Matt", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(30, knight.getHealth());
    }

    @Test
    public void hasType(){
        assertEquals("Warrior", knight.getType());

    }

    @Test
    public void hasItems(){
        assertEquals(0, knight.countItems());
    }

    @Test
    public void canSetHealth(){
        knight.setHealth(50);
        assertEquals(50, knight.getHealth());
    }

    @Test
    public void canDefend(){
        knight.defend(knight2.attack());
        assertEquals(30, knight.getHealth());

    }



}
