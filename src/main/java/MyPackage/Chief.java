package MyPackage;

public class Chief extends Employee{

    private String department;

    public Chief(String name, int salary){
        super(name, salary);
        this.department = "Programming";
    }
    public Chief(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }


    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}
