package com.example.mapper;

import com.example.my.mapper.MyMapper;
import com.example.pojo.Users;
import com.example.pojo.vo.UserAddrVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersMapper extends MyMapper<Users> {
    public List<UserAddrVO> getAddrList(@Param("paramsMap") Map<String, Object> map);
}