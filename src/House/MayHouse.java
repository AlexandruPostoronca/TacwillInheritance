package House;

import Copii.*;
import Parinti.*;

public class MayHouse {
    protected Parinti parinti;
    protected Copii copii;
    public final String address = "Vasile Lupu";


    public MayHouse(Parinti parinti) {
        this.parinti = parinti;
    }

    public MayHouse(Copii copii) {
        this.copii = copii;
    }

    public String getAddress() {
        return address;
    }

    public void say() {
    }
}
