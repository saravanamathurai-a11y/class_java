class Employee {
    int empno;
    String name;
    float sal;

    Employee() {
        empno = 001;
        name = "XYZ";
        sal = 293843938;
    }

    void display() {
        System.out.println("EMP. NO: " + empno + " | Name: " + name + " | Salary: " + sal);
    }
}

class Class1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        emp1.display();
        emp2.display();
        emp3.display();
    }
}

