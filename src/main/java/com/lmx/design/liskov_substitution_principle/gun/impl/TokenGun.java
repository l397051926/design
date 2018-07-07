package com.lmx.design.liskov_substitution_principle.gun.impl;

import com.lmx.design.liskov_substitution_principle.gun.Token;

/**
 * @author liumingxin
 * @create 2018 07 15:16
 * @desc
 **/
public class TokenGun implements Token {
    @Override
    public void shooting() {
        System.out.println("玩具枪在  piu piu ");
    }
}
