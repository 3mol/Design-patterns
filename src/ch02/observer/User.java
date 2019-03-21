package ch02.observer;

/**
 * Created by 胡宇靖 on 2019/3/21.
 */
public class User implements IDisplayElement, IObserver {
    private String Information;

    @Override
    public void update(String Information) {
        this.Information = Information;
        display();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName()+"-接受到信息:" + Information);


    }
}
