package Parinti;

import Copii.Alexandra;
import House.MayHouse;

public class HouseAlexandra extends MayHouse {
    public HouseAlexandra(Alexandra alexandra) {
        super(alexandra);
    }

    @Override
    public void say() {
        copii.say();
        System.out.println("She lives for str. "+getAddress());
    }
}
