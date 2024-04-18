package Parinti;

public class Mama extends Parinti{

    public Mama(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Mama is "+name+ " her family name is "+getFAMILY());
    }
}
