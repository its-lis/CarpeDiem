package com.carpe.diem.service;

import com.github.pagehelper.PageInfo;

public interface SearchUserService {
    PageInfo searchUser();

    int truncateTestUser();
}
