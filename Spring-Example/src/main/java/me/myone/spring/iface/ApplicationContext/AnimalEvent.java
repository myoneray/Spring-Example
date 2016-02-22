package me.myone.spring.iface.ApplicationContext;

import org.springframework.context.ApplicationEvent;

/**
 * Title:AnimalEvent.java <br>
 * Description:通过ApplicationContextAware我们可以把系统中所有 <br>
 * ApplicationEvent传播给系统中所有的ApplicationListener。
 *
 * @author Wangming
 * @since 2016年2月22日
 */
public class AnimalEvent extends ApplicationEvent {
    private String name;

    public String getName() {
        return name;
    }

    /**
     * @param source 事件源对象
     */
    public AnimalEvent(Object source) {
        super(source);
    }

    public AnimalEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AnimalEvent [name=" + name + "]";
    }

}
