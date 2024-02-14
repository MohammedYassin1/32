import edu.calgary.oop.DisasterVictim;
import edu.calgary.oop.supply;

public class Location{
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private supply[] supplies;

    public Location(String name, String address){
        setName(name);
        setAddress(address);
    }
}

/*setters*/

public void setName(String name){this.name = name;}
public void setAddress(String address){this.address = address;}
public void setOccupants(DisasterVictim[] occupants){this.occupants = occupants;}
public void setSupplies(supply[] supplies){this.supplies = supplies;}

/*getters */

public String setName(){return this.name;}
public String setAddress(){return this.address;}
public DisasterVictim[] setOccupants(){return this.occupants;}
public supply[] setSupplies(){return this.supplies;}

