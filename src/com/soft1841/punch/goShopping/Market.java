package com.soft1841.punch.goShopping;
/**
 * @author 王龙傲
 * 2019.3.10
 * 商场抽象类
 */
public abstract class Market {
    //商场名
    public String name;
    //商品名
    public String goods;
    //抽象方法，用来输出信息
    public abstract void shop();
}
