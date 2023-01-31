package com.techgeek.SpirngBoot.Security.Service;

import com.techgeek.SpirngBoot.Security.Entity.UserInfo;
import com.techgeek.SpirngBoot.Security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(UserInfo userInfo){
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        userRepo.save(userInfo);
        return "user added to system";
    }
}
