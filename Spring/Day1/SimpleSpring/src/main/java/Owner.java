public class Owner {

    //dependency
    private Cat cat;
    private String name;

    //constructor injection
    public Owner(Cat cat){
        this.cat = cat;
    }

    //setter injection
    public void setCat(Cat cat){
        this.cat = cat;
    }

    public void makePetTalk(){
        cat.makeCatSpeak();
    }

    public void renameCat(String newName){
        cat.setName(newName);
    }
}
