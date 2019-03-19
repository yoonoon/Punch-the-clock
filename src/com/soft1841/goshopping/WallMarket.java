package com.soft1841.goshopping;
/**
 * @author 王龙傲
 * 2019.3.10
 * 实体店类继承
 */
public class WallMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name+"实体店购买"+goods);
    }
}
