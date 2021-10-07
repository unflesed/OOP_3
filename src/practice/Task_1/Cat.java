package practice.Task_1;

public class Cat extends Pet{
    String sound;
    public Cat(){}
    public Cat(String name, String type, String sound){
        super(name,type);
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public void sound() {
        System.out.println(sound);
    }

}
