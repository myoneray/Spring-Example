package me.myone.spring.iface.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title:InterfaceA.java <br>
 * Description: <br>
 * ApplicationContextAware接口: <br>
 * 当一个类需要获取ApplicationContext实例时，可以让该类实现ApplicationContextAware接口。代码展示如下
 *
 * BeanNameAware接口: <br>
 * 当bean需要获取自身在容器中的id/name时，可以实现BeanNameAware接口。
 * 
 * @author Wangming
 * @since 2016年2月22日
 */
public class InterfaceTest implements ApplicationContextAware, BeanNameAware {

    private String beanName;
    private ApplicationContext applicationContext;

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void run() {
        System.out.println(beanName);
        // 发布自定义事件
        AnimalEvent event = new AnimalEvent(this, "老虎");
        applicationContext.publishEvent(event);
    }

    // Test
    public static void main(String[] args) {
        InterfaceTest interfaceA = new InterfaceTest();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        interfaceA.setApplicationContext(applicationContext);
        interfaceA.run();
    }
}
