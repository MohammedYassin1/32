package edu.ucalgary.oop;

public class MedicalRecord{
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location,String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }
    /*setters*/

    public void setLocation(Location location){this.location = location;}
    public void setTreatmentDetails(String treatmentDetails){this.treatmentDetails = treatmentDetails;}
    public void setDateOfTreatment(String dateOfTreatment){this.dateOfTreatment = dateOfTreatment;}


    /*getters*/

    public Location getLocation(){return this.location;}
    public String getTreatmentDetails(){return this.treatmentDetails;}
    public String getDateOfTreatment(){return this.dateOfTreatment;}
}
