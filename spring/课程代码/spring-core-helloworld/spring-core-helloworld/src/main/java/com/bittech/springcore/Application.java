package com.bittech.springcore;

import com.bittech.springcore.assemble.Foo;
import com.bittech.springcore.instance.ClientService;
import com.bittech.springcore.instance.ClientService3;
import com.bittech.springcore.shape.Shape;
import com.bittech.springcore.shape.XmlShapeCompute;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class Application {
    
    
    public static void main(String[] args) throws InterruptedException, SQLException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//       HelloWorld helloWorld= applicationContext.getBean(HelloWorld.class);
//
//        helloWorld.greeting();


//        Shape circular= (Shape) applicationContext.getBean("circular");
//        System.out.println(circular);
        
        
        Shape triangle1 = (Shape) applicationContext.getBean("triangle");
        System.out.println(triangle1);
        
        
        Shape triangle2 = (Shape) applicationContext.getBean("triangle");
        System.out.println(triangle2);
        System.out.println(triangle1.hashCode());
        System.out.println(triangle2.hashCode());
        System.out.println(triangle1 == triangle2);

        
        ClientService clientService = applicationContext.getBean(ClientService.class);
        System.out.println(clientService);
        ClientService clientService2 = applicationContext.getBean(ClientService.class);
        System.out.println(clientService2);
        
        
        ClientService3 clientService3 = applicationContext.getBean(ClientService3.class);
        
        System.out.println(clientService3);
        
        
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
        
        
        XmlShapeCompute xmlShapeCompute = applicationContext.getBean(XmlShapeCompute.class);
    
        System.out.println(xmlShapeCompute.getShapeComputeInfo());
        
        DataSource dataSource= applicationContext.getBean(DataSource.class);
        
        Connection connection= dataSource.getConnection();
        System.out.println(connection);
    }
    
}
