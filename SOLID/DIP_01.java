package SOLID;

public class DIP_01 {

   public static class Employee {
        private int employeeID;
        private String designation;

        public Employee(int employeeID, String designation) {
            this.employeeID = employeeID;
            this.designation = designation;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public String getDesignation() {
            return designation;
        }
    }

 
    public static class SalaryManager {
        public void updateSalary(Employee employee) {
            
            System.out.println("Updated salary for employee ID: " + employee.getEmployeeID());
        }
    }

    
    public static class EmailService {
        public void sendMail(Employee employee) {
           
            System.out.println("Email sent to employee ID: " + employee.getEmployeeID());
        }
    }

   
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Software Developer");

        SalaryManager salaryManager = new SalaryManager();
        EmailService emailService = new EmailService();

        System.out.println("Employee ID: " + emp.getEmployeeID());
        System.out.println("Designation: " + emp.getDesignation());

        salaryManager.updateSalary(emp);
        emailService.sendMail(emp);
    }
}
