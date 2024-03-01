package com.example.service;

import com.example.pojo.Users;
import com.example.pojo.bo.UserBO;
import com.example.pojo.vo.UserAddrVO;

import java.util.List;

public interface UserService {

    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 判断用户名是否存在
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);

    /**
     * 获取
     * @param id
     * @return
     */
    public List<UserAddrVO> getAddrList(String id);
}
