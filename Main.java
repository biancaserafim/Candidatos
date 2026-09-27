public class Main {

    public static void main(String[] args) {

        Candidato[] candidatos = {
            new Candidato("Carlos", 85.5),
            new Candidato("Ana", 92.0),
            new Candidato("Bruno", 85.5),
            new Candidato("Daniel", 92.0)
        };

        System.out.println("Antes da ordenação:");

        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }

        Sorts<Candidato> sorts = new Sorts<>();

        sorts.insertionSort(candidatos);

        System.out.println("\nDepois da ordenação:");

        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }
}
