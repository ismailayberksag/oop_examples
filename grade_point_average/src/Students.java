import java.util.ArrayList;

public class Students {
    private String name;
    private int age;
    private Status status;
    private ArrayList<Double> midterms;
    private ArrayList<Double> finals;

    public Students(String name, int age, Status status){
        this.name = name;
        this.age = age;
        this.status = status;
        this.midterms = new ArrayList<>();
        this.finals = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    public void addGrades(double midterm, double finalExam){
        midterms.add(midterm);
        finals.add(finalExam);
    }

    public double calculateAverage(){
        double total = 0;
        for(int i = 0; i < finals.size() ; i++){
            total += (midterms.get(i)*0.4 + finals.get(i)*0.6);
        }
        return total/finals.size();
    }

    public void determineStatus() {
        if(calculateAverage() >= 60)                                    status = Status.PASSED;
        else if(calculateAverage() <60 && calculateAverage() >= 0)      status = Status.FAILED;
    }

    public void printResults(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Status: " + status);
    }
}
