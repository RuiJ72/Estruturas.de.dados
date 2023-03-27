package encadeamento.nos;

public class Main {

    public static void main(String[] args) {

        // Instanciar o nó 1
        No no1 = new No("Conteúdo do 1");

        No no2 = new No("Conteúdo do 2");

        // Encadeamento dos nós, apontando o nó 1 para o nó 2
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo do nó 3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo do nó 4");
        no3.setProximoNo(no4);

        // nó 1 -> nó 2 -> nó3 -> nó4 -> null;
        System.out.println();

        System.out.println(no1); // Conteúdo do nó 1
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());

        System.out.println("__________________");
        // Mostrando o encadeamento dos Nós
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
