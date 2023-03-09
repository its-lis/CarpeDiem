package com.carpe.diem.controller;


import com.carpe.diem.service.SearchUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchUserController {

    @Autowired
    private SearchUserService service;

    @ResponseBody
    @PostMapping("/searchUser/{id}/{a}")
    public PageInfo searchUser(@PathVariable Integer id,
                               @PathVariable Integer a) {
        System.out.println("id:"+ id+"a:" +a);
        return service.searchUser();
    }
}
