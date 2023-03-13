package com.carpe.diem.controller;


import com.carpe.diem.service.SearchUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchUserController {

    @Autowired
    private SearchUserService service;

    @GetMapping("/searchUser")
    public PageInfo searchUser() {
        return service.searchUser();
    }

    @GetMapping("/test")
    public String test() {
        return "jenkins—test34";
    }
}
