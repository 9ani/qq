import java.util.ArrayList;
import java.util.Collections;

public class Main {
     public static void printData(String person){
        System.out.println(person.toString());

    }
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        people.add(new Employee("Andrey","Lugankov","doctor",10000));
        people.add(new Student("Ganibek","Alikhanov",1.66));
        people.add(new Student("Abay","Abayev",4));
        Collections.sort(people);

        for(Person person:people){
            printData(String.valueOf(person));

        }
    }

}