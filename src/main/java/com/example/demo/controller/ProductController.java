package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService service;
    
    @PostMapping("/checkprod")
    public String checkprod(@ModelAttribute("item") Product item) {
        Product authitem = service.checkProd(item.getId(),item.getName()); 
        if(Objects.nonNull(authitem)){
            return "redirect:/exists";
        }
        else{
            return "redirect:/notexists";
        }
    }

    @PostMapping("/addproduct")
    public String addprod(@ModelAttribute("item") Product item){
        service.addProd(item.getId(),item.getName());
        return "redirect:/added";
    }
    
    
}
