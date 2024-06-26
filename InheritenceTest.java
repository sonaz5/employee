package nazansonal_211805027_lab4;

public class InheritenceTest {

	public static void main(String[] args) {
		System.out.println("Employee İnformation:\n");
		
		BasePlusCommisionEmployee emp = new BasePlusCommisionEmployee("Ahmet", "Yılmaz", "151-41-1285", 3000.00,0.08,700.00);
		
		System.out.println(emp);
        emp.setBaseSalary(1500.00);
        
        System.out.println("Updated employee information:");
        System.out.println(emp);
	}

}
