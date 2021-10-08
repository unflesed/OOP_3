package OOP_3.Task_2;

public class Main {
    public static void main(String[] args) {
        Pupil[] pupils = {new ExcelentPupil(),new GoodPupil(),new BadPupil(),new ExcelentPupil() };
        ClassRoom classRoom = new ClassRoom(pupils);
        classRoom.getPupils();
    }
}
