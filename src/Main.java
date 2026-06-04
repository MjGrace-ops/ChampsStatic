public class Main {
    public static void main(String[] args) {
        // Instanciez 4 objets Personne
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();
        Personne personne4 = new Personne();


        // Affichez les valeurs des deux compteurs
        System.out.println("(" + personne1.nbLocal + "," +
                Personne.nbInstances + ")");
    }
}
 