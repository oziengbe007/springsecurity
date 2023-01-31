//
//
//

package com.techgeek.SpirngBoot.Security.Service;

import com.techgeek.SpirngBoot.Security.dto.Product;

import com.techgeek.SpirngBoot.Security.repository.UserRepo;
//import com.techgeek.dto.Product;
//import com.javatechie.entity.UserInfo;
//import com.javatechie.repository.UserInfoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {

    List<Product> productList = null;

    @Autowired
    private UserRepo repository;

    @Autowired
//    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void loadProductsFromDB() {
        productList = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> Product.builder()
                        .productId(i)
                        .name("product " + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build()
                ).collect(Collectors.toList());
    }


    public List<Product> getProducts() {
        return productList;
    }

    public Product getProduct(int id) {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
    }
//    public String addUser(User userInfo) {
//        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
//        repository.save(userInfo);
//        return "user added to system ";
//    }
}


//import com.techgeek.SpirngBoot.Security.Entity.Product;
//
//import java.util.List;
//import java.util.Random;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//import jakarta.annotation.PostConstruct;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProductService {
//
//    List<Product> productList = null;
//
//    @PostConstruct
//    public void loadProductFromDb(){
//
//        productList = IntStream.rangeClosed(1,100)
//                .mapToObj(i -> Product.builder()
//                        .productId(i)
//                        .name("product " + i)
//                        .qty(new Random().nextInt(10))
//                        .price(new Random().nextInt(5000)).build()
//                ).collect(Collectors.toList());
//    }
//
//    public List<Product> getProducts(){ return productList;}
//    public Product getProduct(int id){
//
//        return productList.stream()
//                .filter(product -> product.getProductId() == id)
//                .findAny()
//                .orElseThrow(()-> new RuntimeException("Product "+id+" not found"));
//    }
//}