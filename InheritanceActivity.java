package p2222;
 class Employee {
    private long employeeId;
    protected String employeeName;
    private String employeeAddress;
    private long employeePhone;
    protected double basicSalary;
    private double specialAllowance = 250.80;
    private double hra = 1000.50;
//
    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
        System.out.println("Salary for employee " + employeeName + " is: " + salary);
        return salary;
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 10.0/100 * basicSalary;
        System.out.println("Transport allowance for employee " + employeeName + " is: " + transportAllowance);
    }
}

// Manager.jav
class Manager extends Employee {
    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 15.0/100 * basicSalary;
        System.out.println("Transport allowance for manager " + employeeName + " is: " + transportAllowance);
    }
}

// Trainee.java

 class Trainee extends Employee {
    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }
    public void calculateTransportAllowance() {
        double transportAllowance = 10.0/100 * basicSalary;
        System.out.println("Transport allowance for tranee " + employeeName + " is: " + transportAllowance);
    }
}

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager(1001, "peter", "123 Main St", 5551234, 60000);
        Trainee trainee = new Trainee(1002, "park", "456 Oak St", 5555678, 40000);
      //  Employee em=new   Employee(1002, "aryan", "455 Oak St", 5566678, 400034);
        manager.calculateSalary();
        trainee.calculateSalary();
//em.calculateSalary();
        manager.calculateTransportAllowance();
        trainee.calculateTransportAllowance();
       // em.calculateTransportAllowance();
	}

}
