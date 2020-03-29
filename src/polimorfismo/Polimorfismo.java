package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);

        Canario piolin = new Canario();
        hacerCantar(piolin);
        
        Burro igor= new Burro();
        hacerCantar(igor);

    }

    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}
