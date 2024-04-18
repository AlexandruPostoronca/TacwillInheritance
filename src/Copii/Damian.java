package Copii;


public class Damian extends Copii{

    public Damian(String name, String institutiaDeStudii) {
        super(name, institutiaDeStudii);
    }

    @Override
    public void say() {
        System.out.println("My boy's name is "+name+ " he has family "+getFAMILY()+
       ", He studies at school "+institutiaDeStudii+"!");
    }
}
