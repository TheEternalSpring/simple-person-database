public class Person {

    private String name;
    private int age;
    private String city;
    private String occupation;

    public Person(String name, int age, String city, String occupation) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return (getName() + " is currently " + getAge() + " years old, lives in " + getCity() + " and works as a " + getOccupation());
    }
}
