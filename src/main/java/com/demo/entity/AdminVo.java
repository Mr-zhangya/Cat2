package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminVo {
    private String username;
    private String oldPassword;
    private String newPassword;
}
