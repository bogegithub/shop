package com.example.service;

import com.example.pojo.Category;
import com.example.pojo.vo.CategoryVO;
import com.example.pojo.vo.NewItemsVO;

import java.util.List;

public interface CategoryService {

    /**
     * 查询所有一级分类
     * @return
     */
    public List<Category> queryAllRootLevelCat();

    /**
     * 根据一级分类id查询子分类信息
     * @param rootCatId
     * @return
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);

    /**
     * 查询首页每个一级分类下的6条最新商品数据
     * @param rootCatId
     * @return
     */
    public List<NewItemsVO> getSixNewItemsLazy(Integer rootCatId);

    /**
     * 查询首页每个一级分类下的7条最新商品数据
     * @param rootCatId
     * @return
     */
    public List<NewItemsVO> getSevenNewItemsLazy(Integer rootCatId);
}
