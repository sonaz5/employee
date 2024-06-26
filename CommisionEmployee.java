package nazansonal_211805027_lab4;

public class CommisionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	
	

	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}
  
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}



	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}



	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("Gross sales cannot be negative.");
		System.exit(1);
        } }



	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		 if (commisionRate > 0 && commisionRate < 1) {
	            this.commisionRate = commisionRate;
	        } else {
	            System.out.println("Commission rate must be greater than 0 and less than 1.");
	 
	            System.exit(1);
	        }
	    }
	
   public double earnings() {
	   return commisionRate*grossSales;


}

@Override
public String toString() {
	return "First Name=" + firstName +"\n"+ ", last Name=" + lastName + "\n"+", social Security Number="
			+ socialSecurityNumber +"\n"+ ", gross Sales=" + grossSales +"\n"+ ", commision Rate=" + commisionRate + "";
}



 }
   


