package ch01.role;

import ch01.behavior.NotBehavior;
import ch01.interest.PaintInterest;

/**
 * Created by 胡宇靖 on 2019/3/20.
 */
public class Disable extends Man {
    public Disable() {
        iInterest = new PaintInterest();
        iWorkBehavior = new NotBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是残疾人");
    }
}
