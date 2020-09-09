package com.shangguan;
import com.shangguan.dao.someServiceImpl;
import com.shangguan.service.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 10 0:35
 * @Version 1.0
 */
public class MyTest {
    //通过原始的方法来创建对象
    @Test
    public void say(){
        someServiceImpl someService = new someServiceImpl();
        someService.say();
    }
    @Test
    public void Test2(){
        /* 1.获取spring的配置文件*/
        String config="beans.xml";
        //创建spring容器的对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //ApplicationContext就是spring的容器   程序通过容器来获取对象
        //获取对象 需要调用方法来获取
        //获取到的对象需要进行类型转换,转换为接口的类型
        someService service=(someService) ac.getBean("ser");
        service.say();
    }
}
