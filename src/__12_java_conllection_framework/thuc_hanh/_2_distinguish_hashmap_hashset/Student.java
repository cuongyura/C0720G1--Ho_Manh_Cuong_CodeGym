package __12_java_conllection_framework.thuc_hanh._2_distinguish_hashmap_hashset;

public class Student {
    // properties:
    private String name;
    private int age;
    private String address;

    // method constructor:

    public Student() {

    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // get and set:


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
