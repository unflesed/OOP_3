package OOP_3.additional;

public class Blue extends Printer{
    public String blue = "\u001B[34m";
    public String reset = "\u001B[0m";
    public Blue(){}
    @Override
    void print(String value) {
        System.out.println("Значение аргумента: " + blue + value + reset);
    }
}
