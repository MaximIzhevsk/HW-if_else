public class Main {
    public static void main(String[] args) {

        //задание 1

        int age = 18;
        String message;
        boolean isAdult = age >= 18;
        if (isAdult) {
            message = "он совершеннолетний.";
        } else {
            message = "он не достиг совершеннолетия, нужно немного подождать.";
        }
        System.out.println("Если возраст человека равен " + age + ", то " + message);
        System.out.println();

        //задание 2

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println();

        //задание 3

        int speed = 60;
        boolean isSpeedingFine = speed > 60;
        if (isSpeedingFine){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }
        System.out.println();

        //задание 4

        int yearsOld = 1;
        String messageYearsOld;
        if (yearsOld >=2 && yearsOld <= 6) {
            messageYearsOld = "ему нужно ходить в детский сад.";
        } else if (yearsOld >= 7 && yearsOld <= 17) {
            messageYearsOld = "ему нужно ходить в школу.";
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            messageYearsOld = "его место в университете.";
        } else if (yearsOld > 24) {
            messageYearsOld = "ему пора ходить на работу.";
        } else {
            messageYearsOld = "ему пока можно никуда не ходить.";
        }
        System.out.println("Если возраст человека равен " + yearsOld + ", то " + messageYearsOld);
        System.out.println();

        //задание 5

        int ageOfTheChild = 14;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    ", то ему нельзя кататься на аттракционе.");
        } else if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    ", то ему можно кататься на аттракционе в сопровождении.");
        } else System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    ", то ему можно кататься на аттракционе без сопровождения.");
        System.out.println();

        //задание 6

        int numberOfPeople = 103;
        if (numberOfPeople <= 60) {
            System.out.println("В вагоне есть и сидячие и стоячие места.");
        } else if (numberOfPeople > 60 && numberOfPeople <= 102) {
            System.out.println("В вагоне остались только стоячие места.");
        } else System.out.println("Вагон полностью забит.");
        System.out.println();

        //задание 7

        int one = 11, two = 22, three = 33, res;

        if (one > two && one > three) {
            res = one;
        } else if (two > one && two > three) {
            res = two;
        } else res = three;
        System.out.println(res);


    }
}