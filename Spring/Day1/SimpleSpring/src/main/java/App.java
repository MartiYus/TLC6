import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        // look for a bean by type
        Cat myCat = ctx.getBean(Cat.class);

        //pay attention to the order in which they are created
        // Cat myCat = new Cat("Tom");
        Owner myOwner = new Owner(myCat);
        myOwner.renameCat("Agnes");
        myOwner.makePetTalk();

        Cat anotherCat = (Cat) ctx.getBean("myCatBean");
        Owner anotherOwner = new Owner(anotherCat);

        anotherOwner.makePetTalk();

        ((ConfigurableApplicationContext)ctx).close();

    }
}
