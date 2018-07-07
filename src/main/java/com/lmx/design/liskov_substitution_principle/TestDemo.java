package com.lmx.design.liskov_substitution_principle;

import com.lmx.design.liskov_substitution_principle.gun.impl.MachineGun;
import com.lmx.design.liskov_substitution_principle.gun.impl.Pistol;
import com.lmx.design.liskov_substitution_principle.gun.impl.Rifle;
import com.lmx.design.liskov_substitution_principle.gun.impl.TokenGun;
import com.lmx.design.liskov_substitution_principle.user.Soldier;

/**
 * @author liumingxin
 * @create 2018 07 15:08
 * @desc
 **/
public class TestDemo {
    public static void main(String[] args) {
        System.out.println("temtdemo gun !");

        Soldier soldier = new Soldier();
        soldier.kill();
//        soldier.makeGun(new Rifle());
//        soldier.makeGun(new Pistol());
//        soldier.makeGun(new MachineGun());
        soldier.makeGun(new TokenGun());//明显是有问题的
    }
}
