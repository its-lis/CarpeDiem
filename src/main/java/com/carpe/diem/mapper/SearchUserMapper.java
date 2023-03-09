package com.carpe.diem.mapper;

import com.carpe.diem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchUserMapper {
    List<User> searchUserMapper();

    int truncateUser();
}
