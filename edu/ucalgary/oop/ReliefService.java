package edu.ucalgary.oop;

public class ReliefService{
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
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
}


