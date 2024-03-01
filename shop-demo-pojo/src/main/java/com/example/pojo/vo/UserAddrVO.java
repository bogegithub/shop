package com.example.pojo.vo;


import lombok.Data;

import java.util.List;

/**
 * @className: UserAddrVO
 * @author: YanBo
 * @date: 2023/8/8 11:35
 */
@Data
public class UserAddrVO {
    private String id;
    private String username;
    private List<AddrVO> addrList;

}
