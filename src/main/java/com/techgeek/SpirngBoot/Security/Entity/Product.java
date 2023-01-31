package com.techgeek.SpirngBoot.Security.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int productId;
        private String productName;
        private int qty;
        private double price;

//        public Product(int i, String s, int nextInt, int nextInt1) {
//        }

        public int getProductId(){
                return productId;
        }

        public void setProductId(int id){
                this.productId = id;
        }

        public String getProductName(){
                return productName;
        }

        public void setProductName(String productName){
                this.productName = productName;
        }
        public int getProductQty(){
                return qty;
        }

        public void setProductQty(int productQty){
                this.qty = productQty;
        }
        public double getProductPrice(){
                return price;
        }

        public void setProductPrice(double productPrice){
                this.price = productPrice;
        }
}
