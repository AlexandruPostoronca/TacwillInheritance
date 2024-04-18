package Copii;

import Parinti.*;

public class Alexandra extends Copii{
    public Alexandra(String name, String institutiaDeStudii) {
        super(name, institutiaDeStudii);
    }

    @Override
    public void say() {
        System.out.println("My daughter has name "+name+ " and family "+getFAMILY()+
                ", she goes to kindergarten!");
    }
}
