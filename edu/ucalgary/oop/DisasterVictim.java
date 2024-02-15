package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private final int ASSIGNED_SOCIAL_ID;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnections;
    private final String ENTRY_DATE;
    private ArrayList<Supply> personalBelongings;
    private String gender;
    private static int counter;
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
	private static final Pattern PATTERN = Pattern.compile(REGEX);

    //Const
    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        /*add if statment and IllegalArgumentExcemption */
        Matcher match = PATTERN.matcher(ENTRY_DATE);
        boolean valid_date = match.find();

        if(!valid_date){
            throw new IllegalArgumentException("Invalid format for date. Please use format: YYYY-MM-DD.");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;

        this.lastName = null;
        this.dateOfBirth = null;
        this.comments = null;
        this.ASSIGNED_SOCIAL_ID = counter++;
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.familyConnections = new ArrayList<FamilyRelation>();
        this.personalBelongings = new ArrayList<Supply>();
        this.gender = null;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getComments(){
        return comments;
    }

    public int getAssignedSocialId(){
        return ASSIGNED_SOCIAL_ID;
    }

    public ArrayList<MedicalRecord> getMedicalRecords(){
        return medicalRecords;
    }

    public ArrayList<FamilyRelation> getFamilyConnections(){
        return familyConnections;
    }

    public String getEntryDate(){
        return ENTRY_DATE;
    }

    public ArrayList<Supply> getPersonalBelongings(){
        return personalBelongings;
    }

    public String getGender(){
        return gender;
    }

    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
        Matcher match = PATTERN.matcher(dateOfBirth);
        boolean valid_date = match.find();

        if(!valid_date){
            throw new IllegalArgumentException("Invalid format for date. Please use YYYY-MM-DD.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public void setComments(String comments){
        this.comments = comments;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords){
        this.medicalRecords = medicalRecords;
    }

    public void setFamilyConnections(ArrayList<FamilyRelation> familyConnections){
        this.familyConnections = familyConnections;
    }

    public void setPersonalBelongings(ArrayList<Supply> personalBelongings){
        this.personalBelongings = personalBelongings;
    }
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        personalBelongings.remove(supply);
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.add(familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.remove(familyConnection);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
}
