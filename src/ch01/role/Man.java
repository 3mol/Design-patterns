package ch01.role;

import ch01.behavior.IWorkBehavior;
import ch01.interest.IInterest;

/**
 * Created by 胡宇靖 on 2019/3/20.
 */
public abstract class Man {
    // 要标识为抽象,因为需要有子类去实现display方法

    // 一个人 具有的公共属性应该写在父类这里
    // 比如吃饭 睡觉等行为

    // 一个人 特有行为应该独立出一个类
    // 比如打代码 销售 写作...
    IWorkBehavior iWorkBehavior;
    IInterest iInterest;

    public abstract void display();

    public void 吃饭() {
        System.out.println("All of man can eat-kkk ");
    }

    public void 睡觉() {
        System.out.println("All of man can sleep-zzz ");
    }

    //-------------------------------------
    public void setInterest(IInterest interest) {
        iInterest = interest;
    }

    public void setWorkBehavior(IWorkBehavior workBehavior) {
        iWorkBehavior = workBehavior;
    }

    public void preformBehavior() {
        iWorkBehavior.work();
    }

    public void preformInterest() {
        iInterest.interestIn();
    }

}
