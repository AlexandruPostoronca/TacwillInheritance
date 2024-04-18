package Parinti;

public class Tata extends Parinti{

    public Tata(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("My name is "+name+ " my family is "+getFAMILY());
    }
}
