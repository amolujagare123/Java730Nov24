package InheritanceDemo;

public class Employee {

    int salary = 35000;

    void empWork()
    {
        System.out.println("emp Work");
    }
}

class Programmer extends Employee
{
    int bonus = 25000;

    void programmerWork()
    {
        System.out.println("programmer Work");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
    }
}
