import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Robot robot = new Robot();

        System.out.println("Ingrese el nombre del primer usuario: ");
        String nombre1 = teclado.nextLine();
        Hombre hombre1 = new Hombre(nombre1);
        hombre1.jugarConRobot(robot);

        if (robot.estaDormido()){
            robot.despertar();
        }

        System.out.println("Ingrese el nombre de segundo usuario: ");
        String nombre2 = teclado.nextLine();
        Hombre hombre2 = new Hombre(nombre2);
        hombre2.jugarConRobot(robot);

        System.out.println("Juego Terminado...");

    }
}