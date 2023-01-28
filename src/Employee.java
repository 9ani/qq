public class Employee extends Person{
    public String position;
    public double salary;
    Employee(String name, String surname, String position, double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getPosition()+ ": " +getId()+". "+ getName()+" " +getSurname()+" earns "+getPaymentAmount();
    }
}
