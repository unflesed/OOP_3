package practice.Task_1;

public class Dog extends Pet{
    String sound;
    public Dog(){}
    public Dog(String sound){
        super("Rex","sheepdog");
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
