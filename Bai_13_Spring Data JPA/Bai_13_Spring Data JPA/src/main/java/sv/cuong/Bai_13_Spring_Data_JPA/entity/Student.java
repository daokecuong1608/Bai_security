package sv.cuong.Bai_13_Spring_Data_JPA.entity;

import jakarta.persistence.*;

@Entity//đánh dấu class là 1 entity ánh xạ xuống csdl
@Table(name = "students")
public class Student {
//files

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//tu dong tang gia tri trong csdl
private  int  id;

    @Column(name = "last_name" , length = 45)
private String lastName;

    @Column(name = "first_name" , length  = 45)
private String firtsName;

    @Column(name = "email" , length = 45)
private String email;
    //contructor

    public Student() {
    }

    public Student(int id, String lastName, String firtsName, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firtsName = firtsName;
        this.email = email;
    }

    public Student(String lastName, String firtsName, String email) {
        this.lastName = lastName;
        this.firtsName = firtsName;
        this.email = email;
    }
    // getter setter


    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getEmail() {
        return email;
    }
}
