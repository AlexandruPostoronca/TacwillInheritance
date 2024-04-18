package Parinti;

public class Parinti {

    protected String name;
    protected final String FAMILY="Postoronca";

    public Parinti( String name ) {
        this.name = name;
    }

    public String getFAMILY() {
        return FAMILY;
    }

    public void say(){
        System.out.println("My family have four members!!!");
    }
}
