package House;
import Parinti.Tata;

public class MayHouseTata extends MayHouse{
    public MayHouseTata(Tata tata) {
        super(tata);
    }

    @Override
    public void say() {
        parinti.say();
        System.out.println("I live for str. "+getAddress());
    }
}
