package OOP_3.Task_2;

public class ClassRoom {
    private Pupil[] pupils = new Pupil[4];
    public ClassRoom(Pupil[] pupils){
        this.pupils = pupils;
    }
    public void getPupils() {
        int i = 1;
        for (Pupil pupil: pupils) {
            System.out.println(i + " pupil: ");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            i++;
        }
    }
}
