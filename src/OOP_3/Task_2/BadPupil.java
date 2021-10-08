package OOP_3.Task_2;

public class BadPupil extends Pupil{
    @Override
    void study(){
        System.out.println("I don't study");
    }
    @Override
    void  read(){
        System.out.println("I don't read");
    }
    @Override
    void  write(){
        System.out.println("I don't write");
    }
    @Override
    void relax(){
        System.out.println("I relax a lot");
    }
}
