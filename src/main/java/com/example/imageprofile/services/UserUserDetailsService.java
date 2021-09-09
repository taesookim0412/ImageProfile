package com.example.imageprofile.services;

import com.example.imageprofile.models.User;
import com.example.imageprofile.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        this.createTestVariables();
        System.out.println("Authenticating");
        Optional<User> user = userRepository.findUserByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
        System.out.println(user.toString());
        return user.map(com.example.imageprofile.models.UserDetails::new).get();
    }

    private void createTestVariables() {
        String username = "aa";
        Optional<User> optUser = userRepository.findUserByUsername(username);
        if (optUser.isPresent()){
            return;
        }
        User newUser = new User(username, "bb");
        userRepository.save(newUser);
    }
}
