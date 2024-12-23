import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Öğrenci İsmi : ");
        String name = sc.nextLine();
        System.out.println("Öğrenci Yaşı : ");
        int age = sc.nextInt();

        Students student = new Students(name,age,Status.PASSED);

        System.out.println("Alınan ders adedi :  ");
        int numberOfCourses = sc.nextInt();

        for(int i=0 ; i<numberOfCourses ; i++){
            System.out.println((i+1) + ". dersin vize notu : ");
            double minterm = sc.nextDouble();
            System.out.println((i+1) + ". dersin final notu : ");
            double finalExam = sc.nextDouble();
            student.addGrades(minterm, finalExam);
        }

        student.determineStatus();
        student.printResults();
        sc.close();
    }
}