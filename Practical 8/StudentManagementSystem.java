import java.util.Scanner;

class StudentManagementSystem {

    static void printMenu() {

        System.out.println("\n1 -> Add Student");
        System.out.println("2 -> Display Students");
        System.out.println("3 -> Search Student");
        System.out.println("4 -> Update Student");
        System.out.println("5 -> Exit");
    }

    static {
        System.out.println("----- Welcome to SGGS Student Management System -----");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String managerName = input.nextLine();

        Manager manager = new Manager(managerName);

        while (true) {

            printMenu();

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    String name = input.nextLine();

                    System.out.print("Enter reg no: ");
                    String regNo = input.nextLine();

                    System.out.print("Enter address: ");
                    String address = input.nextLine();

                    System.out.print("Enter mobile no: ");
                    long mobNo = input.nextLong();
                    input.nextLine();

                    Student s = new Student(name, regNo, address, mobNo);

                    manager.addStudent(s);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter reg no to search: ");
                    String searchReg = input.nextLine();

                    manager.searchStudent(searchReg);

                    break;

                case 4:

                    System.out.print("Enter reg no to update: ");
                    String updateReg = input.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = input.nextLine();

                    System.out.print("Enter new address: ");
                    String newAddress = input.nextLine();

                    System.out.print("Enter new mobile no: ");
                    long newMob = input.nextLong();
                    input.nextLine();

                    manager.updateStudent(updateReg, newName, newAddress, newMob);

                    break;

                case 5:

                    System.out.println("Exiting program...");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}