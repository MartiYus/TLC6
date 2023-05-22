import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    //default is singleton!
    //@Scope("prototype")
    public Cat myCatBean(){
        return new Cat("Tom");
    }

//    @Bean
//    public Cat anotherCatBean(){
//        return new Cat("Missy");
//    }
}
