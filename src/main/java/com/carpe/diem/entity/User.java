package com.carpe.diem.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
}
