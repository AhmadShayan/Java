public class Employee {
    private String name;
    private int salary;

    public Employee(){
        salary = 3000;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
}
