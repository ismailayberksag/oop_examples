//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a company
        Company company = new Company("ai lab","D114 KTUN");

        //Display Company Details
        company.displayCompanyDetails();

        //Create departments
        Company.Department dept1 = new Company.Department("Engineering",101);
        Company.Department dept2 = new Company.Department("Social Media", 102);

        //Display departments details
        System.out.println("\nDepartments:");
        dept1.displayDepartmentDetails();
        dept2.displayDepartmentDetails();

        //Add employees to departments
        System.out.println("\nEmployees in Department:");

        //Engineering Employees
        System.out.println("Engineering Department:");
        Company.Employee emp1 = company.new Employee("Ayberk",1,75000);
        Company.Employee emp2 = company.new Employee("Şevval",2,70000);
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        //Social Media Employees
        System.out.println("\nSocial Media Department:");
        Company.Employee emp3 = company.new Employee("Alper",3,60000);
        emp3.displayEmployeeDetails();
    }
}