package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 40,
                weeklyHours = 40;
        double stateTaxRate = 2.5,
                federalTaxRate = 17.5;

        int salaryBeforeTax = hourlyRate * weeklyHours * 365;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("salaryBeforeTax is= " + salaryBeforeTax);
        System.out.println("totalTax is= " + totalTax);
        System.out.println("salaryAfterTax is = " + salaryAfterTax);





    }
}

/*Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

 */