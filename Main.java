import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n==================================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM ");
            System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Student s = new Student();

                    System.out.print("Enter Student ID: ");
                    s.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Enter Email: ");
                    s.setEmail(sc.nextLine());

                    System.out.print("Enter Course: ");
                    s.setCourse(sc.nextLine());

                    if (dao.addStudent(s))
                        System.out.println("Student added successfully.");
                    else
                        System.out.println("Failed to add student.");

                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }

                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student found = dao.getStudentById(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found.");

                    break;

                case 4:
                    Student update = new Student();

                    System.out.print("Enter Student ID: ");
                    update.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    update.setName(sc.nextLine());

                    System.out.print("Enter New Email: ");
                    update.setEmail(sc.nextLine());

                    System.out.print("Enter New Course: ");
                    update.setCourse(sc.nextLine());

                    if (dao.updateStudent(update))
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Update failed.");

                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (dao.deleteStudent(deleteId))
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Delete failed.");

                    break;

                case 6:
                    System.out.println("Thank you for using the Student Management System.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
