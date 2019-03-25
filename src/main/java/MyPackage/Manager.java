package MyPackage;

public class Manager extends Employee {

    private String position;

    public Manager(String name, int salary){
        super(name, salary);
        this.position = "Manager";
    }

    public Manager(String name, int salary, String position){
        super(name, salary);
        this.position = position;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}












