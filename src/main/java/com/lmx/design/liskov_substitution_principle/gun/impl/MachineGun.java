package com.lmx.design.liskov_substitution_principle.gun.impl;

import com.lmx.design.liskov_substitution_principle.gun.Gun;

/**
 * @author liumingxin
 * @create 2018 07 15:14
 * @desc
 **/
public class MachineGun implements Gun {
    @Override
    public void shooting() {
        System.out.println(" 机关枪在扫射 敌人");
    }
}
