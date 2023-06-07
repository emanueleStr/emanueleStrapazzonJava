import java.util.Scanner;

public class PontoPartida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ponto de partida: ");
        int partida = sc.nextInt();
        System.out.println("Digite o ponto de chegada: ");
        int chegada = sc.nextInt();

        System.out.println("O ponto de partida é: "+ partida);

        for (int i = partida + 1; i < chegada; i++){
            if(i % 10 == 0){
                System.out.println(i);
            }
        }

        System.out.println("O ponto de chegada é: "+chegada);

    }
}