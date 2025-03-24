package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Илья Редуктор");

        Tester tester1 = new Tester("Толя", "Лепёшкин", 3, 3, 13000);
        Tester tester2 = new Tester("Ваня", "Деревяшкин", 5, 3, 23000);

        
        Tester exp = Tester.sravni(tester1, tester2);
        if (exp != null) {
            System.out.println("Самый опытный тестрировщик: " + exp.name + " " + exp.surname);
        } else {
            System.out.println("Опыт одинаковый");

        }
    }
}