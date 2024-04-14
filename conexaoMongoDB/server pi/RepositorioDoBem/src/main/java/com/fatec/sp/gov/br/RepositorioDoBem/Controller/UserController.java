package com.fatec.sp.gov.br.RepositorioDoBem.Controller;


import com.fatec.sp.gov.br.RepositorioDoBem.Entity.User;
import com.fatec.sp.gov.br.RepositorioDoBem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "Usuário Deletado com sucesso";
    }

}
