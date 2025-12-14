package org.zaurtregulov.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("org.zaurtregulov.spring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return new Cat();
    }
int i=0;
    @Bean

    public Person personBean(){
        i++;
        System.out.println("xyu="+i);
        return new Person(catBean());
    }
}
