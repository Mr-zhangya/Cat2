package com.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
public class Admin {
    private Integer id;
    private String username;
    private String password;
}
