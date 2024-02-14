import edu.calgary.oop.MedicalRecord;
import edu.calgary.oop.FamilyRelation;
import edu.calgary.oop.Supply;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        /*add if statment and IllegalArgumentExcemption */
        this.setFirstName(firstName);
        this.setENTERYDATE(ENTRY_DATE)
    }

}

/*setters*/
public void setFirstName(String firstName) {this.firstName = firstName;}
public void setLastName(String lastName){this.lastName = lastName;}
/*YYYY/MM/DD */
public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
    /*add if statment and IllegalArgumentExcemption */
    this.dateOfBirth = dateOfBirth;
}
public void setComments(String comments){this.comments = comments;}
public void setASSIGNED_SOCIAL_ID(int ASSIGNED_SOCIAL_ID){this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;}
public void setMedicalRecord(MedicalRecord[] medicalRecords){this.medicalRecords = medicalRecords;}
public void setFamilyRelations(FamilyRelation[] familyConnections){this.familyConnections = familyConnections;}
public void setENTRY_DATE(Sting ENTRY_DATE){this.ENTRY_DATE = ENTRY_DATE;}
public void setSupply(Supply[] personalBelongings){this.personalBelongings = personalBelongings;}
public void setGender(String gender){this.gender = gender;}
public void setCounter(int counter){this.counter = counter;}

/*getters*/
public void getFirstName(String firstName) {this.firstName = firstName;}
public void getLastName(String lastName){this.lastName = lastName;}
/*YYYY/MM/DD */
public void getDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
    /*add if statment and IllegalArgumentExcemption */
    this.dateOfBirth = dateOfBirth;
}
public String getFirstName() {return this.firstName;}
public String getLastName(){return this.lastName;}
public String getDateOfBirth(){return this.dateOfBirth;}
public String getComments(){return this.comments;}
public int getASSIGNED_SOCIAL_ID(){return this.ASSIGNED_SOCIAL_ID;}
public MedicalRecord[] getMedicalRecord(){return this.medicalRecords;}
public FamilyRelation[] getFamilyRelations(){return this.familyConnections;}
public String getENTRY_DATE(){return this.ENTRY_DATE;}
public Supply[] getSupply(){return this.personalBelongings;}
public String getGender(){return this.gender;}
public int getCounter(){return this.counter;}

/*functions */

public void addPersonalBelonging(Supply supply) {}

public void removePersonalBelonging(Supply supply) {}

public void addFamilyConnection(FamilyRelation familyConnection) {}

public void removeFamilyConnection(FamilyRelation familyConnection) {}

public void addMedicalRecord(MedicalRecord medicalRecord){}