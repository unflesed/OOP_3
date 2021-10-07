package practice.Task_1;

public class Cat extends Pet{
    String sound;
    public Cat(){}
    public Cat(String sound){
        super("Vasya","siamese");
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
    @Override
    public void show() {
        System.out.println(getName());
    }
    @Override
    public void type() {
        System.out.println(getType());
    }
}
