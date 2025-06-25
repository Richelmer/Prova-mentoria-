import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
        double[] bimestres = new double[4];
        double[] semestres = new double[2];
        double mediaFinal;

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            bimestres[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        semestres[0] = (bimestres[0] + bimestres[1]) / 2;
        semestres[1] = (bimestres[2] + bimestres[3]) / 2;
        mediaFinal = (semestres[0] + semestres[1]) / 2;

        for (int i = 0; i < 4; i++)
            System.out.println((i + 1) + "º Bimestre: " + bimestres[i]);

        System.out.println("1º Semestre: " + semestres[0]);
        System.out.println("2º Semestre: " + semestres[1]);
        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}
