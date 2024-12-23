public class Company {
    private String companyName;
    private String companyAddress;

    //Constructor
    public Company(String name,String address){
        this.companyName=name;
        this.companyAddress=address;
    }

    //Display Company Details
    public void displayCompanyDetails(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Company Address: "+companyAddress);
    }

    //Static Nested Class: Department
    public static class Department{
        private String departmentName;
        private int departmentId;

        //Constructor
        public Department(String name, int id){
            this.departmentName=name;
            this.departmentId=id;
        }

        //Display Department Details
        public void displayDepartmentDetails(){
            System.out.println("Department Name: "+departmentName);
            System.out.println("Department Id: "+departmentId);
        }
    }

    //Inner Class: Employee
    public class Employee{
        private String employeeName;
        private int employeeId;
        private double salary;

        //Constructor
        public Employee(String name, int id, double salary){
            this.employeeName = name;
            this.employeeId=id;
            this.salary=salary;
        }

        //Display employee details
        public void displayEmployeeDetails(){
            System.out.println("    Employee Name: "+employeeName);
            System.out.println("    Employee Id: "+employeeId);
            System.out.println("    Salary: "+salary);
        }
    }
}
