package ch01.behavior;

/**
 * Created by 胡宇靖 on 2019/3/20.
 */
public class NotBehavior implements IWorkBehavior {
    @Override
    public void work() {
        System.out.println("我什么都不会");
    }
}
