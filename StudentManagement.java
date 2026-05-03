import java.util.*;

public class StudentManagement {
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Marks: ");
                    list.add(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No records found");
                    } else {
                        for (Student s : list) s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.id == id) {
                            s.display();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Student not found");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int del = sc.nextInt();
                    boolean removed = list.removeIf(s -> s.id == del);
                    if (removed) System.out.println("Deleted successfully");
                    else System.out.println("Student not found");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
