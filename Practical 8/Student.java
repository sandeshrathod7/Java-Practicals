class Student {

    String name;
    String regNo;
    String address;
    long mobNo;

    Student(String name, String regNo, String address, long mobNo) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;
        this.mobNo = mobNo;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + mobNo);
        System.out.println();
    }
}