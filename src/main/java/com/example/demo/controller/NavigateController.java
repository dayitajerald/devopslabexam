package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NavigateController {

    @GetMapping("/add")
    public String addProductPage() {
        return "addprod";
    }

    @GetMapping("/exists")
  public String display() {
      return "exists";
  }

    @GetMapping("/notexists")
  public String nodisplay() {
      return "notexists";
  }

  @GetMapping("added")
  public String adddedpage() {
      return "addedprod";
  }
  
    
    
}
