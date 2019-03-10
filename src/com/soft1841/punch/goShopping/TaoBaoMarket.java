package com.soft1841.punch.goShopping;

/**
 * @author 王龙傲
 * 2019.3.10
 * 淘宝类继承
 */
public class TaoBaoMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name+"网购"+goods);
    }
}
