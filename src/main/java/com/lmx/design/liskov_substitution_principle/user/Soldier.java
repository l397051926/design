package com.lmx.design.liskov_substitution_principle.user;

import com.lmx.design.liskov_substitution_principle.gun.Gun;

/**
 * @author liumingxin
 * @create 2018 07 15:20
 * @desc
 **/
public class Soldier {
    public void kill(){
        System.out.println("士兵在射杀敌人 ！！");
    }
    public void makeGun(Gun gun){
        gun.shooting();
    }
}
