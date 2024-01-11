public class GrantData {
    private String companyName;
    private String streetName;
    private double grantSize;
    private int fiscalYear;
    private String businessType;
    private int numberOfJobs;

    // конструктор
    public GrantData(String companyName, String streetName, double grantSize,
                     int fiscalYear, String businessType, int numberOfJobs) {
        this.companyName = companyName;
        this.streetName = streetName;
        this.grantSize = grantSize;
        this.fiscalYear = fiscalYear;
        this.businessType = businessType;
        this.numberOfJobs = numberOfJobs;
    }

    // геттеры
    public String getCompanyName() {
        return companyName;
    }

    public String getStreetName() {
        return streetName;
    }

    public double getGrantSize() {
        return grantSize;
    }

    public int getFiscalYear() {
        return fiscalYear;
    }

    public String getBusinessType() {
        return businessType;
    }

    public int getNumberOfJobs() {
        return numberOfJobs;
    }
}