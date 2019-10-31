package com.demo.service;


import com.demo.vo.R;

public interface AdminService {
    R isLogin(String username, String password);

    R addAdmin(String username, String password);

    R updateNewPassword(String username, String oldPassword,String newPassword);
}
