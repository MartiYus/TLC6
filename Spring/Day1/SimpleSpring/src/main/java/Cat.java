import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void makeCatSpeak(){
        System.out.println("Meow meow, my name is "+ name );
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @PostConstruct
    public void afterCreation(){
        System.out.println("Cat created");
    }

    @PreDestroy
    public void justBeforeDisposal(){
        System.out.println("Cat being disposed of");
    }


}
