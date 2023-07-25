package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    public static final int DUMMY_STARTING_HEALTH = 100;
    public static final int DUMMY_STARTING_EXPERIENCE = 10;
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int BROKEN_AXE_DURABILITY = 0;
    private static final int LOST_DURABILITY_AFTER_ATTACK = 1;

    private Dummy dummy;
    private Axe axe;
    private Axe brokenAxe;

    @Before
    public void setUp(){
        //Assert
        Dummy dummy = new Dummy(DUMMY_STARTING_HEALTH, DUMMY_STARTING_EXPERIENCE);
        Axe axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        Axe brokenAxe = new Axe(AXE_ATTACK, BROKEN_AXE_DURABILITY);
    }

    @Test
    public void weaponLosesDurabilityAfterAttack(){
        //Act
        axe.attack(dummy);
        //Assert
        Assert.assertEquals(AXE_DURABILITY - LOST_DURABILITY_AFTER_ATTACK, axe.getDurabilityPoints());
    }

    @Test (expected = IllegalStateException.class)
    public void attackWithBrokenWeponThrowsExeption(){
        //Act
        brokenAxe.attack(dummy);
    }
}