class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;
    
    Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
    
    void printSalary() {
        System.out.println("The salary of " + this.name + " is " + this.salary);
    }
}

class Employee extends Member {
    String specialization;
    
    Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;
    
    Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of Employee class
        Employee emp = new Employee("John Doe", 25, "123-456-7890", "123 Main St, Anytown, USA", 50000, "Software Development");
        System.out.println("Employee: Name=" + emp.name + ", Age=" + emp.age + ", Phone=" + emp.phone + ", Address=" + emp.address + ", Salary=" + emp.salary + ", Specialization=" + emp.specialization);
        emp.printSalary();
        
        // create an object of Manager class
        Manager mgr = new Manager("Jane Smith", 35, "987-654-3210", "456 Elm St, Othertown, USA", 75000, "Sales");
        System.out.println("Manager: Name=" + mgr.name + ", Age=" + mgr.age + ", Phone=" + mgr.phone + ", Address=" + mgr.address + ", Salary=" + mgr.salary + ", Department=" + mgr.department);
        mgr.printSalary();
    }
}
