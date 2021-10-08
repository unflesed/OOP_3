package OOP_3.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key;
        System.out.println("Введите ключ доступа:");
        key = sc.next();
        if (key.equals("pro")) {
            DocumentWorker proDW = new ProDocumentWorker();
            proDW.openDocument();
            proDW.editDocument();
            proDW.saveDocument();
        }else if (key.equals("exp")) {
            DocumentWorker expDW = new ExpertDocumentWorker();
            expDW.openDocument();
            expDW.editDocument();
            expDW.saveDocument();
        }else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}
