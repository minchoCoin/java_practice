import java.util.Objects;

public class Employee {
    //Your code here - 멤버 변수를 정의하시오
    private String name;
    private double salary;

    //Your code here - 생성자를 정의하시오
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName() {
        //Your code here
        return name;
    }

    public Double getSalary() {
        //Your code here
        return salary;
    }

    @Override
    public String toString() {
        //Your code here
        return String.format("%s %.1f",name,salary);
    }

    @Override
    public boolean equals(Object o) {
        //Your code here
        if(o instanceof Employee){
            if(o == null) return false;
            Employee obj = (Employee) o;
            return Objects.equals(this.name,obj.name) && this.salary == obj.salary;
        }
        return false;
    }


    @Override
    public int hashCode() {
        //Your code here
        return Objects.hash(name,salary);
    }

}