class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void display() {
        super.display();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.age = 35;
        m.employeeId = 202;
        m.department = "IT";
        m.display();
    }
}