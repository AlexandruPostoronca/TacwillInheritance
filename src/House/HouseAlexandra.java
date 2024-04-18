package House;

import Copii.Alexandra;

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
