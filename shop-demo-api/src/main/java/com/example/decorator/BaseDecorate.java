package com.example.decorator;

/**
 * @className: BaseDecorate
 * @author: YanBo
 * @date: 2023/9/14 19:45
 */
public abstract class BaseDecorate implements IDecorator {
    private IDecorator decorator;

    public BaseDecorate(IDecorator decorator) {
        this.decorator = decorator;
    }

    /**
     * 调用
     */
    public void decorate() {
        if (decorator != null) {
            decorator.decorate();
        }
    }

}
