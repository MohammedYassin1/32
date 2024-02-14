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

public String getName(){return this.name;}
public String getAddress(){return this.address;}
public DisasterVictim[] getOccupants(){return this.occupants;}
public supply[] getSupplies(){return this.supplies;}

/*functions*/

public void  addOccupant(DisasterVictim occupant){}
public void  removeOccupant(DisasterVictim occupant){}
public void addSupply(Supply supply){}
public void removeSupply(Supply supply){}
