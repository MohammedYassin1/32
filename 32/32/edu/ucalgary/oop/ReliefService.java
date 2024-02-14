import edu.calgary.oop.DisasterVictim;
import edu.calgary.oop.Inquirer;

public class ReliefService{
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation){
        setInquirer(inquirer);
        setMissingPerson(missingPerson);
        setDateOfInquiry(dateOfInquiry);
        setInfoProvided(infoProvided);
        setLastKnownLocation(lastKnownLocation);
    }
}
/*setters*/

public void setInquirer(Inquirer inquirer){this.inquirer = inquirer;}
public void setMissingPerson(DisasterVictim missingPerson){this.missingPerson = missingPerson;}
public void setDateOfInquiry(String dateOfInquiry){this.dateOfInquiry = dateOfInquiry;}
public void setInfoProvided(String infoProvided){this.infoProvided = infoProvided;}
public void setLastKnownLocation(Location lastKnowLocation){this.lastKnownLocation = lastKnowLocation;}

/*getters*/

public Inquirer getInquirer(){return this.inquirer;}
public DisasterVictim getMissingPerson(){return this.missingPerson;}
public String getDateOfInquiry(){return this.dateOfInquiry;}
public String getInfoProvided(){return this.infoProvided;}
public Location getLastKnownLocation(){return this.lastKnownLocation;}

