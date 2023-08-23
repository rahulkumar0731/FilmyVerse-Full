package com.project.signup.SignUp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.apache.catalina.User;

@Entity
@Table(name = "peoples")
public class Details {
    @Id
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column (name = "number")
    private String number;

    public Details () {}
    public Details(String firstname,String lastname,String username,String password,String email,String number){
        this.firstname=firstname;
        this.lastname=lastname;
        this.username= username;
        this.password=password;
        this.email=email;
        this.number=number;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getUsername(){return username;}
    public void setUsername(String username){this.username=username;}
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){this.email=email;}
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){this.number=number;}
}
