package com.lmx.design.liskov_substitution_principle.gun.impl;

import com.lmx.design.liskov_substitution_principle.gun.Gun;

/**
 * @author liumingxin
 * @create 2018 07 15:12
 * @desc
 **/
public class Pistol implements Gun {
    @Override
    public void shooting() {
        System.out.println("手枪在射击敌人  ---");
    }
}
