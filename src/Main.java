import Copii.*;
import House.HouseDamian;
import House.HouseMama;
import House.MayHouse;
import House.MayHouseTata;
import Parinti.*;

public class Main {
    public static void main(String[] args) {
        Parinti parinti = new Parinti("");
        Tata tata = new Tata(Name.Alexandru.name());
        Mama mama = new Mama(Name.Diana.name());
        Damian damian = new Damian(Name.Damian.name(), Name.Dante_Alighieri.name());
        Alexandra alexandra = new Alexandra(Name.Alexandra.name(), "");

        System.out.println("May House-------------------------------------------------");
        MayHouse mayHouse = new MayHouse(parinti);
        MayHouseTata mayHouseTata = new MayHouseTata(tata);
        HouseMama houseMama = new HouseMama(mama);
        HouseDamian houseDamian = new HouseDamian(damian);
        HouseAlexandra houseAlexandra = new HouseAlexandra(alexandra);
        mayHouse.say();
        System.out.println();
        mayHouseTata.say();
        System.out.println();
        houseMama.say();
        System.out.println();
        houseDamian.say();
        System.out.println();
        houseAlexandra.say();
    }
}