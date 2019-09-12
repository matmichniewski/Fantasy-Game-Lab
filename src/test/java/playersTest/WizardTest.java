package playersTest;

import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Gandalf", 30, "Wizard");
    }

    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(30, wizard.getHealth());
    }

    @Test
    public void hasType(){
        assertEquals("Wizard", wizard.getType());

    }

    @Test
    public void hasItems(){
        assertEquals(0, wizard.countItems());
    }

    @Test
    public void canSetHealth(){
        wizard.setHealth(50);
        assertEquals(50, wizard.getHealth());
    }




}
