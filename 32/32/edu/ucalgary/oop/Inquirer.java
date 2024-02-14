package edu.calgary.oop; /*?*/

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String INFO, String SERVICES_PHONE){
        setFIRST_NAME(FIRST_NAME);
        setLAST_NAME(LAST_NAME);
        setINFO(INFO);
        setSERVICES_PHONE(SERVICES_PHONE);
    }
}
/*setter*/

public void setFIRST_NAME(String FIRST_NAME) {this.FIRST_NAME = FIRST_NAME;}
public void setLAST_NAME(String LAST_NAME) {this.LAST_NAME = LAST_NAME;}
public void setINFO(String INFO) {this.INFO = INFO;}
public void setSERVICES_PHONE(String SERVICES_PHONE) {this.SERVICES_PHONE = SERVICES_PHONE;}

/*setter*/

public String getFIRST_NAME() {return this.FIRST_NAME;}
public String getLAST_NAME() {return this.LAST_NAME;}
public String getINFO() {return this.INFO;}
public String getSERVICES_PHONE() {return this.SERVICES_PHONE;}