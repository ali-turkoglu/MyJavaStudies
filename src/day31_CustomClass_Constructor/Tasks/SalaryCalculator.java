package day31_CustomClass_Constructor.Tasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate,double stateTaxRate,double federalTaxRate,int weeklyHours){
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate/100;      // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate=federalTaxRate/100;
        this.weeklyHours=weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Salary=$" + hourlyRate +
                ", stateTax=$" + stateTax() +
                ", federalTax=$" + federalTax() +
                ", Salary After Tax=$" + salaryAfterTax() +
                '}';
    }
}

/*SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object



 */
