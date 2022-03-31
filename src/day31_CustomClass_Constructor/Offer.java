package day31_CustomClass_Constructor;

public class Offer {

    public String location,companyName,jobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO,isWFH,isFullTime;


    public String toString() {
        return "\nOffer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                "}";
    }

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }
}
/*Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object

 */