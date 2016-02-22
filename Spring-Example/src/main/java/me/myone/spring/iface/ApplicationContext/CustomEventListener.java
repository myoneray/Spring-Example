package me.myone.spring.iface.ApplicationContext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Title:CustomEventListener.java <br>
 * Description:当需要监听自定义事件时，可以新建一个实现ApplicationListener接口的类，并将该类配置到Spring容器中。
 * See:src/main/resources/spring.xml
 *
 * @author Wangming
 * @since 2016年2月22日
 */
public class CustomEventListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof AnimalEvent) {
            AnimalEvent animalEvent = (AnimalEvent) event;
            System.out.println("监听信息:" + animalEvent);
        }
    }

}
