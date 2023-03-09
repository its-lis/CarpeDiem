package com.carpe.diem.service.impl;

import com.carpe.diem.entity.User;
import com.carpe.diem.mapper.SearchUserMapper;
import com.carpe.diem.service.SearchUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchUserServiceImpl implements SearchUserService {

    @Autowired
    private SearchUserMapper mapper;

    @Override
    public PageInfo searchUser() {
        PageHelper.startPage(1,4);
        List<User> users = mapper.searchUserMapper();
        PageInfo<User> info = new PageInfo<>(users);
        return info;
    }

    @Override
    public int truncateTestUser() {
        return mapper.truncateUser();
    }
}
