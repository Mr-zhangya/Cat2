package com.demo.mapper;


import com.demo.entity.Admin;
import com.demo.entity.AdminVo;
import com.demo.vo.R;
import org.springframework.stereotype.Repository;

public interface AdminMapper {
    int selectAdminByUserNameAndPassword(Admin admin);

    int addAdmin(Admin admin);

    int selectAdminByUserNameAndOldPassword(AdminVo adminVo);

    int updateNewPassword(AdminVo adminVo);
}
