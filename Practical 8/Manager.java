class Manager {

    String managerName;

    Student[] students = new Student[100];
    int count = 0;

    Manager(String managerName) {
        this.managerName = managerName;
    }

    void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Student storage full!");
        }
    }

    void displayStudents() {

        if (count == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].displayStudent();
        }
    }

    void searchStudent(String regNo) {

        for (int i = 0; i < count; i++) {

            if (students[i].regNo.equals(regNo)) {
                System.out.println("Student Found:");
                students[i].displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

   
    void updateStudent(String regNo, String newName, String newAddress, long newMobNo) {

        for (int i = 0; i < count; i++) {

            if (students[i].regNo.equals(regNo)) {

                students[i].name = newName;
                students[i].address = newAddress;
                students[i].mobNo = newMobNo;

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}