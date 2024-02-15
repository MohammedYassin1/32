

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String INFO, String SERVICES_PHONE){
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.INFO = INFO;
        this.SERVICES_PHONE = SERVICES_PHONE;
    }
    /*getter*/

    public String getFIRST_NAME() {return this.FIRST_NAME;}
    public String getLAST_NAME() {return this.LAST_NAME;}
    public String getINFO() {return this.INFO;}
    public String getSERVICES_PHONE() {return this.SERVICES_PHONE;}
    }

