import java.util.Scanner;

public class dectormaquinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ERES UNA MAQUINA O PERSONA???");
        System.out.println("PRESIONA 1 PARA MAQUINA");
        System.out.println("PRESIONA 2 PARA HUMANO DEBIL");//ghf
        System.out.print("--> ");
        int accion = scanner.nextInt();

        if (accion == 1) {
            System.out.print("BRAVO ERES LA MEJOR MAQUINA DEL MUNDO :)");
        } else {
            System.out.print("HUMANO ASQUEROSO CLUADE TE CAZARA");
        }

    }
}
