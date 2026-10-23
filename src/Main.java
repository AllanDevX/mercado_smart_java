import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int guardarIndice = -1;
        float preco;
        int quantidade = 0;
        float total = 0;

        String arrProdu[] = {
                "Tomate", "Cebola", "Mamao", "Arroz", "Azeite",
                "Cuscuz", "Pimentao", "Feijao", "Macarrao", "Farofa"
        };

        float precoUnita[] = { 2.99f, 3.99f, 4.59f, 5.48f, 11.89f,
                2.99f, 1.89f, 5.48f, 3.99f, 5.99f
        };

        while (true) {
            System.out.println("Digite sua entrada: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("EXIT")) {
                System.out.println("Saindo.....");
                while (true) {
                    System.out.println("Digite o produto: ");
                    String produto = sc.nextLine();
                    if (produto.equalsIgnoreCase("COMPLETE")) {
                        System.out.println("Saindo da secao produtos.....");
                        break;
                    }

                    for (int i = 0; i < arrProdu.length; i++) {
                        if (produto.equals(arrProdu[i])) {
                            guardarIndice = i;
                            break;
                        }
                    }
                    preco = precoUnita[guardarIndice];

                    System.out.println("Qual o produto vc deseja: ");
                    produto = sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();

                    float resultado = preco * quantidade;
                    total = resultado + total;

                    System.out.println("O valor total da compra e " + total);
                }
            }
            sc.close();
        }
    }

    static int buscarItem(String arrProdu[], String produto) {
        for (int i = 0; i < arrProdu.length; i++) {
            if (produto.equals(arrProdu[i])) {
                return i;
            }
        }
        return -1;
    }

    static float calcularProdu(float precoUnita[]) {
        float acumulador = 0;
        for (int i = 0; i < precoUnita.length; i++) {
        acumulador = precoUnita[i] + acumulador;
    }
       float media = acumulador / precoUnita.length;
       return media;
    }

    static String[] filtraProdu(float precoUnita[], String[] arrProdu, float precoLimite) {
        int contarProdu = 0;
        int verificaFiltro = 0;
        for (int i = 0; i < precoUnita.length; i++) {
            if (precoUnita[i] < precoLimite) {
                contarProdu++;
            }
        }

        String[] produtosFiltrado = new String[contarProdu]; 
        for (int i = 0; i < precoUnita.length; i++) {
            if (precoUnita[i] < precoLimite) {
                produtosFiltrado[verificaFiltro] = arrProdu[i];
                 verificaFiltro++;
            }
        }
        return produtosFiltrado;
    }
}