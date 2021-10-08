package OOP_3.additional;

public class Red extends Printer {
    public String red = "\u001B[31m";
    public String reset = "\u001B[0m";
    public Red(){}

    @Override
    void print(String value) {
        System.out.println("Значение аргумента: " + red + value + reset);
    }
}
