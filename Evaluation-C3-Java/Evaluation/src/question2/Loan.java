package question2;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj){
		
		if(employeeObj instanceof PermanentEmployee)
		{
			double loanAmount = (15/100)*employeeObj.salary;
			return loanAmount;
		}
		else
		{
			double loanAmount = (15/100)*employeeObj.salary;
			return loanAmount;
		}
		
	}
	
	private Loan() {
		
	}
	
	

}
