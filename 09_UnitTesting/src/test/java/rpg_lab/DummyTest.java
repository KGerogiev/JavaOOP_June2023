package rpg_lab;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    public static final int ATTACK_POINTS = 10;
    public static final int DEAD_DUMMY_STARTING_HEALTH = 0;
    public static final int TAKE_EXPERIENCE_BY_DUMMY = 10;

    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        //Arrange
        Dummy dummy = new Dummy(AxeTest.DUMMY_STARTING_HEALTH, AxeTest.DUMMY_STARTING_EXPERIENCE);
        Dummy deadDummy = new Dummy(DEAD_DUMMY_STARTING_HEALTH, AxeTest.DUMMY_STARTING_EXPERIENCE);
    }

    @Test
    public void dummyLossesHealthAfterTakeAttack() {
        dummy.takeAttack(ATTACK_POINTS);
        //Assert
        Assert.assertEquals(AxeTest.DUMMY_STARTING_HEALTH - ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionAfterGetAttacked() {
        //Act
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void deadDummyGivesXP() {
        //Act
        int XPGived = deadDummy.giveExperience();
        //Assert
        Assert.assertEquals(TAKE_EXPERIENCE_BY_DUMMY, XPGived);
    }

    @Test(expected = IllegalStateException.class)
    public void allveDummyShouldNotGiveXPButThrowException() {
        //Act
        dummy.giveExperience();
    }
}