package com.lmx.design.liskov_substitution_principle.gun.impl;

import com.lmx.design.liskov_substitution_principle.gun.Gun;

/**
 * @author liumingxin
 * @create 2018 07 15:11
 * @desc
 **/
public class Rifle implements Gun {
    @Override
    public void shooting() {
        System.out.println("步枪 在射击敌人");
    }
}
