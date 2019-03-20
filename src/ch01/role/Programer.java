package ch01.role;

import ch01.behavior.CodeBehavior;
import ch01.interest.PhotoInterest;

/**
 * Created by 胡宇靖 on 2019/3/20.
 */
public class Programer extends Man {
    public Programer() {
        // 方式1:构造实例后自己传入兴趣和行为
        iInterest = new PhotoInterest();
        iWorkBehavior = new CodeBehavior();
    }

    public void display() {
        System.out.println("我是程序员~");
    }
}
