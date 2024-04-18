package House;

import Parinti.Mama;

public class HouseMama extends MayHouse{
    public HouseMama(Mama mama) {
        super(mama);
    }
    @Override
    public void say() {
        parinti.say();
        System.out.println("she lives for str. "+getAddress());
    }
}
