package com.techgeek.SpirngBoot.Security.repository;


import com.techgeek.SpirngBoot.Security.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository <UserInfo, Integer>{

    Optional<UserInfo> findByName(String name);
}
