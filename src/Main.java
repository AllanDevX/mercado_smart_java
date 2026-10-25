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

        int estoqueProdu[] = { 10, 20, 40, 50, 60,
                39, 32, 23, 1, 3
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
                        total = DescontoValor(total);
                        break;
                    }

                    for (int i = 0; i < arrProdu.length; i++) {
                        if (produto.equals(arrProdu[i])) {
                            guardarIndice = i;
                            break;
                        }
                    }

                    System.out.println("Qual o produto vc deseja: ");
                    produto = sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();

                    int indice = buscarItem(arrProdu, produto);

                    if (indice != -1) {
                        preco = precoUnita[indice];
                        if (estoqueProdu(estoqueProdu, quantidade, indice)) {
                            float resultado = preco * quantidade;
                            total = resultado + total;
                        } else {
                            System.out.println("Estoque insuficiente");
                        }
                    } else {
                        System.out.println("Produto não encontrado");
                    }

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

    static float DescontoValor(float total) {
        float desconto = 0;
        if (total >= 100) {
            desconto = total * 0.10f;
            total = total - desconto;
        }
        return total;
    }

    static boolean estoqueProdu(int estoqueProdu[], int quantidade, int indice) {
        if (estoqueProdu[indice] >= quantidade) {
            estoqueProdu[indice] = estoqueProdu[indice] - quantidade;
            return true;
        } else {
            return false;
        }
    }
}