package com.example.imageprofile;

import com.example.imageprofile.models.User;
import com.example.imageprofile.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageProfileApplication.class, args);

    }

}
