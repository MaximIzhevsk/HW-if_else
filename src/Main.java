public class Main {
    public static void main(String[] args) {

        //задание 1

        int age = 18;
        String message;
        boolean isAdult = age >= 18;
        if (isAdult) {
            message = "он совершеннолетний";
        } else {
            message = "он не достиг совершеннолетия, нужно немного подождать";
        }
        System.out.println("Если возраст человека равен " + age + ", то " + message);
        System.out.println();

        //задание 2

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
}