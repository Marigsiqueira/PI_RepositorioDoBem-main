package com.fatec.sp.gov.br.RepositorioDoBem.Service;

import com.fatec.sp.gov.br.RepositorioDoBem.Entity.User;
import com.fatec.sp.gov.br.RepositorioDoBem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}