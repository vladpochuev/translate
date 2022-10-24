import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("______________________");
        System.out.println("|    Введите слово    |");
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("|____________©luxusxc_|");
        String scRead = sc.nextLine();

        Test test = new Test(scRead);

        if (scRead.matches("[А-я іїъ]+")) {
                scRead = scRead.toLowerCase();

                String output = String.valueOf(test.getObject(scRead)); // получение перевода с русского на английский

                if(output.equals("null")) {
                    System.out.println("Слово не найдено");
                } else {
                    String outputMod = output.charAt(0) + output.substring(1).toLowerCase(); // с заглавной буквы

                    System.out.println(outputMod);
                }
        } else if (scRead.matches("[A-z ]+")) {
            try {
                scRead = scRead.toUpperCase();

                Animal animal = Animal.valueOf(scRead);

                String output = animal.getTranslation().toUpperCase();

                String outputMod = output.charAt(0) + output.substring(1).toLowerCase();

                System.out.println(outputMod);
            } catch (IllegalArgumentException e) {
                System.out.println("Слово не найдено");
            }
        }
    }
}
