
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Student / 2. Teacher");
        int pilihan = in.nextInt();

        System.out.println("age: ");
        int age = in.nextInt();
        System.out.println("Nama: ");
        String name = in.nextLine();
        
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("student number: ");
            int studentNumber = in.nextInt();
            System.out.println("Score: ");
            int score = in.nextInt();
            System.out.println("major: ");
            int major = in.nextInt();
            student c1 = new student(name, age, studentNumber, score, major);
            c1.print();
        }else if(pilihan == 2){
            System.out.println("1. fullTime / 2. part time");
            int pilih = in.nextInt();

        if(pilih == 1){
            System.out.println("anual salary: ");
            int anualsalary = in.nextInt();
            System.out.println("unit: ");
            String unit = in.nextLine();
            System.out.println("subject: ");
            String subject = in.nextLine();
            fullTime c2 = new fullTime(name, age, subject, anualsalary,unit);
            c2.print();
        }else if(pilih == 2){
            System.out.println("hours worked: ");
            int hoursworked = in.nextInt();
            String subject = in.nextLine();
            partTime c3 = new partTime(name, age,subject, hoursworked);
            c3.print();
        }else{
            System.out.println("ga Ada");
        }

        }
        scanner.close();
    }
}
