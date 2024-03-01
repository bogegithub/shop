package com.example.enums;

/**
 * @className: CategoryEnum
 * @author: YanBo
 * @date: 2023/8/7 14:32
 */
public enum CategoryEnum {

    ONE_CATEGORY(1, "分类一"),
    TWO_CATEGORY(2, "分类二"),
    THREE_CATEGORY(3, "分类一");

    public final Integer type;
    public final String value;

    CategoryEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

}
