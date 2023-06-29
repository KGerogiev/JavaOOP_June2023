package P03_RandomArrayList_LAB;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    public Object getRandomElement(){
       int index = new Random().nextInt(super.size());
        Object object = new Object();
        object = super.get(index);
        super.remove(index);
        return  object;
    }
}
