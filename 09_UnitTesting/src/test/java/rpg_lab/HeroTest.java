package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroTest {

    public static final int TARGET_EX = 10;
    private Weapon fakeWeapon;
    private Target fakeTarget;

    @Before
    public void setUp(){
        //Arrange
        Weapon fakeWeapon = Mockito.mock(Weapon.class);
        Target fakeTarget = Mockito.mock(Target.class);
    }

    @Test
    public void takeExperienceWhenLargerIsDead(){
        //Arrange
        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(TARGET_EX);

        Hero hero = new Hero("Pesho", fakeWeapon);
        //Act
        hero.attack(fakeTarget);
        //Assert
        Assert.assertEquals(hero.getExperience(), fakeTarget.giveExperience());

    }
}