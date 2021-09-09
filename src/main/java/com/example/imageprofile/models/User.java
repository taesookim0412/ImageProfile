package com.example.imageprofile.models;

import com.example.imageprofile.repositories.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.build.ToStringPlugin;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    public User(){
        this.username = "";
        this.password = "";
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;

    }
//    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    @ToStringPlugin.Exclude
    private @JsonIgnore String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("PASSWORD: " + password);
        this.password = new BCryptPasswordEncoder().encode(password);
    }


}
