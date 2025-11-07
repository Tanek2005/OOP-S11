class Student {
    private String name;
    private int id;
    private static int totalRegistrations = 0;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalRegistrations++;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void showTotal() {
        System.out.println("Total Registrations: " + totalRegistrations);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        s1.display();
        s2.display();
        Student.showTotal();
    }
}