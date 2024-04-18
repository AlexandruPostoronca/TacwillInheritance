package House;

import Copii.Damian;

public class HouseDamian extends MayHouse{
    public HouseDamian(Damian damian) {
        super(damian);
    }

    @Override
    public void say() {
       copii.say();
        System.out.println("he lives for str. "+getAddress());
    }
}
