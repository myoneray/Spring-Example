package me.myone.spring.iface.ApplicationContext;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Title:AnimalEventService.java <br>
 * Description:关于在spring 容器初始化 bean 和销毁前所做的操作定义方式有三种：<br>
 * 第一种：通过@PostConstruct 和 @PreDestroy 方法 实现初始化和销毁bean之前进行的操作<br>
 * 第二种是：通过 在xml中定义init-method 和 destory-method方法<br>
 * 第三种是： 通过bean实现InitializingBean和 DisposableBean接口<br>
 * 此类使用第三种!
 *
 * @author Wangming
 * @since 2016年2月22日
 */
public class AnimalEventService implements InitializingBean, DisposableBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void destroy() throws Exception {
        System.out.println("初始化:" + message);

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("销毁:" + message);

    }

}
