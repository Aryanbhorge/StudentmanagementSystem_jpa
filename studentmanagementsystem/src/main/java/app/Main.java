package app;

import java.util.List;
import java.util.Scanner;
import Entity.StudentEntity;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService obj = new StudentService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Student Management Menu -----");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Last Name");
            System.out.println("3. View All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    StudentEntity student = new StudentEntity();
                    System.out.print("Enter Student ID: ");
                    student.setStudent_id(scanner.nextInt());
                    scanner.nextLine();

                    System.out.print("Enter First Name: ");
                    student.setFirstName(scanner.nextLine());

                    System.out.print("Enter Last Name: ");
                    student.setLastName(scanner.nextLine());

                    System.out.print("Enter Age: ");
                    student.setstudent_age(scanner.nextInt());

                    obj.saveStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
                    obj.updateStudent(updateId, newLastName);
                    System.out.println("Student updated successfully.");
                    break;

                case 3:
                    List<StudentEntity> studentList = obj.getAllStudent();
                    if (studentList.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (StudentEntity e : studentList) {
                            System.out.println(e.getstudent_id() + " " +
                                               e.getFirstName() + " " +
                                               e.getLastName() + " " +
                                               e.getstudent_age());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    obj.deletestudent(deleteId);
                    System.out.println("Student deleted successfully.");
                    break;

                case 5:
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}