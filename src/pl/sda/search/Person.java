package pl.sda.search;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private Long age;

    public Person(String name, String surname, Long age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            return this.age.equals(((Person) obj).getAge());
        }
        return false;
//        return compareTo(((Person) obj)) == 0;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age < o.getAge()) {
            return -1;
        }
        return 0;
    }
}
