package web.model;


import javax.persistence.*;
import java.util.Objects;


@Table(name = "users")
@Entity(name = User.PERSISTANCE_NAME)
public class User {

    static final String PERSISTANCE_NAME = "User";


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;


    @Column(name = "age")
    private byte age;

    public User() {

    }

    public User(int id, String name, byte age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
