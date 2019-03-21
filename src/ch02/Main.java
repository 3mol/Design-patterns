package ch02;

import ch02.observer.Admin;
import ch02.observer.Customer;
import ch02.observer.User;
import ch02.subject.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();

        Admin admin = new Admin();
        User user = new User();
        Customer customer = new Customer();
        // 如同Android中的Buttion#addListener
        // 点击按钮后执行每一个Listener对象的perform()

        dataSource.registerObserver(admin);
        dataSource.registerObserver(user);
        dataSource.registerObserver(customer);
        // 信息来的时候,执行Observer#update
        dataSource.setInformation("123");
    }
}
