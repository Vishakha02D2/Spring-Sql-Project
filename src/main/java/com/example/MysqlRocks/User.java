package com.example.MysqlRocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//so that hibrnate can identify whose attributes to pick for table creation
@Table(name = "user_info")
//@table is just for giving table name,by defualt : tablename === classname
public class User {
    @Id
    private int id; //id is primary key
    private String name;
    private String age;
    private String mobNumber;

    User(){   //defualt constructor

    }

    public User(int id, String name, String age, String mobNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNumber = mobNumber;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }
}
