import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;
    String name;

    public Phone (int number, String model,  int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone (){

    }
    public Phone (String model){
        this.model = model;
    }
    public Phone (int weight){
        this.weight = weight;
    }
    public static void receiveCall (String name){
        System.out.println("Телефонує " + name);
    }
    public static void receiveCall_2 (String name,  int number){
        System.out.println("Телефонує " + name + ". Номер телефону " + number);
    }
    public static void getNumber(int number){
        System.out.println("Номер телефону " + number);
    }
    public static void getmodel(String model){
        System.out.println("Модель телефону " + model);
    }
    public static void getweight(int weight){
        System.out.println("Вага телефону " + weight);
    }
    public static void sendMessage(int ... number){
        System.out.print("Цим номерам телефонів буде надіслано повідомлення: " + Arrays.toString(number));
    }
}
