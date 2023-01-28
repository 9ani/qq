public abstract  class Person implements Payable, Comparable<Person> {
    private static int id_gen=1;
    private String name;
    private String surname;
private int id;
    public Person(){
        id=id_gen++;

}
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public abstract String toString();
    public String getPosition(){
    return "Unknown";
  }

    @Override
    public int compareTo(Person o) {
        return  (int)(this.getPaymentAmount()-o.getPaymentAmount());
    }
}


