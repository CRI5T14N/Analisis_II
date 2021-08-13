import java.util.Scanner;

public class BankATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cardNum = "6228123123"; // número de tarjeta
        int pwd = 888888; // contraseña
        boolean flag = true; // declara una variable booleana
        double surplus = 1000;// balance

        / ** Limita el número de inicios de sesión ** /
        for (int i = 1; i <= 3; i++) {
            System.out.println("Por favor inserte su tarjeta bancaria:");
            String inputCard = input.next();
            System.out.println("Por favor ingrese su contraseña:");
            int inputPwd = input.nextInt();

            // verificar cuenta y contraseña
            if (inputCard.equals(cardNum) && inputPwd == pwd) {
                flag = true;
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Lo siento, la contraseña es incorrecta, aún tienes" + (3 - i) + "¡Segunda oportunidad!");
                } else {
                    System.out.println("Lo siento, tu tarjeta está bloqueada!");
                    break;
                }
                flag = false;
            }
        }