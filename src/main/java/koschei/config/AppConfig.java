package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood){
        return new Island2(wood);
    }

    @Bean
    public static Rabbit4 getRabbit(Duck5 duck){
        return new Rabbit4(duck);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle){
        return new Egg6(needle);
    }

}
