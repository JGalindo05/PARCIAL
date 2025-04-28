import java.util.Scanner;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de control de Robot ---");
            System.out.println("1. Avanzar");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver nivel de energía");
            System.out.println("4. Dormir al robot");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar batería");
            System.out.println("7. Salir (Poner a dormir al robot)");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos pasos quieres que avance?: ");
                    int pasosAvanzar = teclado.nextInt();
                    robot.avanzar(pasosAvanzar);
                    break;
                case 2:
                    System.out.print("¿Cuántos pasos quieres que retroceda?: ");
                    int pasosRetroceder = teclado.nextInt();
                    robot.retroceder(pasosRetroceder);
                    break;
                case 3:
                    System.out.println("Energía actual: " + robot.energiaActual() + " unidades.");
                    break;
                case 4:
                    robot.dormir();
                    break;
                case 5:
                    robot.despertar();
                    break;
                case 6:
                    robot.recargar();
                    break;
                case 7:
                    robot.dormir();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!robot.estaDormido());

        System.out.println(nombre + " ha terminado de jugar con el robot.");
    }
}
