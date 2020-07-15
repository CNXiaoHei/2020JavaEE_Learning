package demo03;

import javax.sound.midi.Soundbank;
import java.util.Random;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 19:25
 **/
public class HeroSystem {
    public static void main(String[] args) {
        DragonKnight dk = new DragonKnight();
        PhantomAssassin pa = new PhantomAssassin();
        dk.skillOne(pa);
        pa.skillThree(dk);
        System.out.println(pa.HP);
        System.out.println(dk.HP);
    }
}

abstract class Hero {
    int HP;
    int MP;
    int attack;
    int defense;

    public Hero() {
    }

    public Hero(int HP, int MP, int attack, int defense) {
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHP() {
        return HP;
    }

    public void subMP(int n){
        this.MP -= n;
    }

    abstract void skillOne(Hero enemy);
    abstract void skillTwo(Hero enemy);
    abstract void skillThree(Hero enemy);
    abstract void show();

    public boolean mpTest(int MP,int sub) {
        if(MP-sub<=0) {
            return false;
        } else {
            return true;
        }
    }
}

class DragonKnight extends Hero {
    public DragonKnight() {
        this.HP = 1000;
        this.MP = 1000;
        this.attack = 250;
        this.defense = 100;
        show();
    }

    public DragonKnight(int HP, int MP, int attack, int defense) {
        //super(HP, MP, attack, defense);
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defense = defense;
        show();
    }

    @Override
    void skillOne(Hero enemy) {
        //晕
        if (mpTest(this.MP,30)) {
            this.attack += 30;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 30;  //消耗蓝
            this.attack -= 30;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void skillTwo(Hero enemy) {
        //吐息
        if (mpTest(this.MP,100)) {
            this.attack += 100;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 100;  //消耗蓝
            this.attack -= 100;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void skillThree(Hero enemy) {
        //变身
        if (mpTest(this.MP,300)) {
            this.attack += 300;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 300;  //消耗蓝
            this.attack -= 300;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void show() {
        System.out.println("巨龙永不服输！");
    }
}

class PhantomAssassin extends Hero {
    public PhantomAssassin() {
        this.HP = 800;
        this.MP = 1500;
        this.attack = 450;
        this.defense = 80;
        show();
    }

    public PhantomAssassin(int HP, int MP, int attack, int defense) {
        //super(HP, MP, attack, defense);
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defense = defense;
        show();
    }

    @Override
    void skillOne(Hero enemy) {
        //晕
        if (mpTest(this.MP,150)) {
            this.attack += 100;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 150;  //消耗蓝
            this.attack -= 100;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void skillTwo(Hero enemy) {
        //吐息
        if (mpTest(this.MP,450)) {
            this.attack += 300;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 450;  //消耗蓝
            this.attack -= 300;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void skillThree(Hero enemy) {
        //变身
        if (mpTest(this.MP,500)) {
            int rollattack = new Random().nextInt(1000);
            this.attack += rollattack;    //增加攻击力
            enemy.HP -= this.attack - enemy.defense;  //攻击敌人
            this.MP -= 500;  //消耗蓝
            this.attack -= rollattack;
        } else {
            System.out.println("蓝量不足");
        }
    }

    @Override
    void show() {
        System.out.println("恩赐解脱！");
    }
}