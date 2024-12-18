package InheritanceDemo.SuperDemo;

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
  //  int salary = 45000;



    void programmerWork()
    {
        System.out.println("programmer Work");
    }
    void empWork()
    {
        System.out.println("emp Work by programmer");
    }
    void display()
    {
        System.out.println("bonus="+bonus);
        System.out.println("salary="+super.salary); //
        programmerWork();
        super.empWork();
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
      //  p.display();
    }
}
