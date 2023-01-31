package com.techgeek.SpirngBoot.Security.Controller;

import com.techgeek.SpirngBoot.Security.Entity.UserInfo;
import com.techgeek.SpirngBoot.Security.Service.UserService;
import com.techgeek.SpirngBoot.Security.dto.Product;
import com.techgeek.SpirngBoot.Security.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;
    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo user){
        return  userService.addUser(user);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProduct(id);
    }

}
