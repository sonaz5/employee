package nazansonal_211805027_lab4;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	private double baseSalary;
	

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Base salary cannot be negative.");
            System.exit(1);
        }
		
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		        if (baseSalary >= 0) {
		            this.baseSalary = baseSalary;
		        } else {
		            System.out.println("Base salary cannot be negative.");
		  
		            System.exit(1);
		        }
		  
	}
	


	@Override
	public double earnings() {
		return super.earnings()+ baseSalary;
	}


	@Override
	public String toString() {
		return "FİRST NAME :" + getFirstName()+"\n"+
				"LAST NAME: "+ getLastName()+"\n"+
				"SOCİAL SECURİTY NUMBER: "+ getSocialSecurityNumber()+"\n"+
				"GROSS SALES: "+ getGrossSales()+"\n"+
				"COMMİSİON RATE: "+ getCommisionRate()+"\n"+
				"BASE SALARY: "+ getBaseSalary()+"\n"+
				"EARNİNGS: "+ earnings()+"\n";
	}
	

	
	


	

}
