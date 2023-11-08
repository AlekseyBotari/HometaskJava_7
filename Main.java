import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    static int countBook = 0;


    public static void main(String[] args) {

//---------------------------------------Task 1---------------------------------------

        Artifact exhibit1 = new Artifact(212121);
        Artifact exhibit2 = new Artifact(212121, "Ацтеки");
        Artifact exhibit3 = new Artifact(212121, "Ацтек", 12);

//---------------------------------------Task 2---------------------------------------
        DatingSite date = new DatingSite((short) 45, 190, "Kate");

//---------------------------------------Task 3---------------------------------------

        //Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації
        // змінних класу – number, model та weight.

//            Phone phoneTest = new Phone(46, "Nokia ", 190);
//            System.out.println("Номер " + phoneTest.number);
//            System.out.println("Модель " + phoneTest.model);
//            System.out.println("Вес " + phoneTest.weight);
//            System.out.println();

        //Створіть клас Phone, який містить змінні number, model і weight.
        //Створіть три екземпляри цього класу.
        //Виведіть на консоль значення їх змінних.

//            phoneTest.number = 45;
//            phoneTest.model = "Nokia ";
//            phoneTest.weight = 190;
//
//            System.out.println("Номер " + phoneTest.number);
//            System.out.println("Модель " + phoneTest.model);
//            System.out.println("Вес " + phoneTest.weight);

        //Додати в клас Phone методи: receiveCall, має один параметр - ім'я. Виводить на консоль повідомлення
        // "Телефонує {name}". Метод getNumber повертає номер телефону. Викликати ці методи кожного з об'єктів.
//            Phone phoneTest = new Phone();
//            phoneTest.receiveCall("Tome");
//            phoneTest.getNumber(phoneTest.number);
//            phoneTest.getmodel(phoneTest.model);
//            phoneTest.getweight(phoneTest.weight);
        //Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних
        // класу – number, model.

        //Phone phoneTest = new Phone(46, "Nokia ");

        //Додати конструктор без параметрів.
//            Phone phoneTest = new Phone(46, "Nokia ");
//            System.out.println("Номер " + phoneTest.number);
//            System.out.println("Модель " + phoneTest.model);

        //Створіть три екземпляри цього класу з параметрами
//            Phone phoneTest = new Phone(46);
//            Phone phoneTest1 = new Phone("Nokia ");
//            System.out.println("Модель " + phoneTest.weight);
//            System.out.println("Модель " + phoneTest1.model);

        //Додайте перевантажений метод receiveCall, який приймає два параметри - ім'я телефону та
        // номер телефону телефону. Викликати цей метод.
//            Phone phoneTest = new Phone();
//            phoneTest.receiveCall_2("Tome", 46);

        //Створити метод sendMessage з аргументами змінної довжини. Цей метод приймає на
        // вхід номери телефонів, яким буде надіслано повідомлення. Метод виводить на консоль
        // номери цих телефонів.
//            Phone phoneTest = new Phone();
//            phoneTest.sendMessage(46, 78, 90, 699);

//---------------------------------------Task 4---------------------------------------

//      Методи move() і talk(), в яких просто вивести на консоль повідомлення - "Такийсь Person говорить".
//        Person person1 = new Person();
//        person1.move("Surname");
//        person1.talk("Surname2");

        //Додайте два конструктори - Person() та Person(fullName, age).
//        Person person1 = new Person();
//        person1.fullName = "fullName";
//        person1.age = 23;
//        System.out.println(person1.fullName +  " " + person1.age);
//        System.out.println();
//        Person person2 = new Person("fullName", 34);
//        System.out.println(person2.fullName +  " " + person2.age);
//---------------------------------------Task 5---------------------------------------

        Reader reader = new Reader("Пригоди", "Петров В. В");
        countBook++;

        Reader reader1 = new Reader("Словник", "Петров В. В");
        countBook++;

        Reader reader2 = new Reader("Енциклопедія", "Петров В. В");
        countBook++;

        reader.takeBook(countBook, reader.nameOfReader);
        Reader.takeBook(reader.bookName);
        Reader.takeBook(reader1.bookName);
        Reader.takeBook(reader2.bookName);

        Reader.returnBook(countBook, reader.nameOfReader);
    }
}

