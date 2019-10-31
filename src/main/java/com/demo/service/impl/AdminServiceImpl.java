package com.demo.service.impl;

import com.demo.entity.Admin;
import com.demo.entity.AdminVo;
import com.demo.mapper.AdminMapper;
import com.demo.service.AdminService;
import com.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    Admin admin = new Admin();
    public R isLogin(String username, String password) {

        admin.setUsername(username);
        admin.setPassword(password);

        int count = adminMapper.selectAdminByUserNameAndPassword(admin);
        if (count == 1) {
            return R.setOK(count);
        }
        return R.setERROR();
    }

    public R addAdmin(String username, String password) {
        admin.setUsername(username);
        admin.setPassword(password);

        int count = adminMapper.addAdmin(admin);
        if (count > 0) {
            return R.setOK(count);
        }
        return R.setERROR();

    }

    public R updateNewPassword(String username, String oldPassword, String newPassword) {
        AdminVo adminVo = new AdminVo();
        adminVo.setUsername(username);
        adminVo.setOldPassword(oldPassword);
        adminVo.setNewPassword(newPassword);

        int count = adminMapper.selectAdminByUserNameAndOldPassword(adminVo);

        if (count > 0) {
            int i = adminMapper.updateNewPassword(adminVo);
            return R.setOK(i);
        }
        return R.setERROR();
    }
}
