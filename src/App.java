import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double litro,metro,preco,capacidade,latas,total;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o tamanho em metros quadrados da área a ser pintada: ");
        metro = teclado.nextDouble();
        teclado.close();

        litro = metro /3;
        preco = 80.0;
        capacidade = 18;

        latas = litro / capacidade;
        total = latas * preco;

        System.out.printf("\nQuantidade de latas de tintas necessárias: %.1f ",+latas);
        System.out.printf("\nR$ %.2f reais",+total);

    }
}
