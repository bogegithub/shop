package com.example.my.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @className: MyMapper
 * @author: YanBo
 * @date: 2023/8/2 10:08
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
