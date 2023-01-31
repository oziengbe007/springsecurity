//package com.techgeek.SpirngBoot.Security.Controller;
//
//
//import com.techgeek.SpirngBoot.Security.Entity.UserInfo;
//import com.techgeek.SpirngBoot.Security.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//    @Autowired
//    private UserService userService;
//    @PostMapping("/new")
//    public String addNewUser(@RequestBody UserInfo user){
//        return  userService.addUser(user);
//    }
//}
