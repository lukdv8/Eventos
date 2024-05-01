public class Prog {
    public static void main(String[] args) {
        BilheteEvento b1 = new BilheteEvento(0);
        BilheteEvento b2 = new BilheteEvento(0);
        CatracaEvento c1 = new CatracaEvento();

        c1.registraEntrada(b1);
        c1.registraEntrada(b2);
        b1.imprime();
        b2.imprime();
        c1.imprime();
        
        c1.registraSaída(b2);
        b1.imprime();
        b2.imprime();
        c1.imprime();
    }
}