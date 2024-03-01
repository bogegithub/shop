package com.example.decorator;

/**
 * @className: CurtainDecorate
 * @author: YanBo
 * @date: 2023/9/14 19:53
 */
public class CurtainDecorate extends BaseDecorate{

    public CurtainDecorate(IDecorator decorator) {
        super(decorator);
    }

    @Override
    public void decorate() {
        System.out.println(" 窗帘装饰。。。");
        super.decorate();
    }
}
