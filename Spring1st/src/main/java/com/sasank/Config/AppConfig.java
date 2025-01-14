package com.sasank.Config;

import com.sasank.Alien;
import com.sasank.Computer;
import com.sasank.Desktop;
import com.sasank.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan("com.sasank")
@Configuration
public class AppConfig {
//
//    @Bean
//    public Alien alien(Computer cm){  //@Qualifier("desktop")
//        Alien obj=new Alien();
//        obj.setAge(25);
//        obj.setCm(cm);
//        return obj;
//    }
//
////    @Bean(name = {"desk1","desk2"})
////    @Scope("prototype")
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
