package MyPackage;

public class Inheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("Vasya", 1000, "Manager");
        System.out.println(manager.getName());
        System.out.println(manager.getPosition());
        System.out.println(manager.getSalary());

        Chief chief = new Chief ("Petya",1500, "Programming");
        System.out.println();
        System.out.println(chief.getName());
        System.out.println(chief.getSalary());
        System.out.println(chief.getDepartment());

        Secretary secretary = new Secretary();
        System.out.println();
        System.out.println(secretary.makeCoffee());





    }



    }
