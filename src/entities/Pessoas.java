package entities;

public class Pessoas {
    private String nome;
    private double altura;
    private int idade;

    public Pessoas() {
    }

    public Pessoas(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static double calcularAlturaMedia(Pessoas[] pessoas) {
        double somarAltutas = 0;
        for (Pessoas pessoa : pessoas) {
            somarAltutas += pessoa.getAltura();
        }
        double mediaAltura = somarAltutas / pessoas.length;
        return mediaAltura;
    }

    public static double menor16(Pessoas[] pessoas) {
        int quantidade = 0;
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                quantidade++;
            }
        }
        return ((double) quantidade / pessoas.length) * 100;
    }

    public static void nomesMenordeIdade(Pessoas[] pessoas) {
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
    }

    public static void relatorio(Pessoas[] pessoa) {
        System.out.println("Altura Média: " + String.format("%.2f", calcularAlturaMedia(pessoa)));

        System.out.println("Pessoas com menos de 16 Anos: " + String.format("%.2f%%", menor16(pessoa)));

        nomesMenordeIdade(pessoa);
    }

}
