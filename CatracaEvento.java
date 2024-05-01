public class CatracaEvento {
    private int qtdePessoas;

    public CatracaEvento(){
        this.qtdePessoas = 0;
    }
    public void registraEntrada(BilheteEvento bilhete){
        if (bilhete.getStatusBilhete() == 0) {
            bilhete.entrada();
            this.qtdePessoas++;
        }else{
            System.out.println("Bilhete já registrado");
        }
    }
    public void registraSaída(BilheteEvento bilhete){
        if (bilhete.getStatusBilhete() == 1) {
            bilhete.saida();
            this.qtdePessoas--;
        }else{
            System.out.println("Bilhete não efetuou entrada");
        }
    }
    public void imprime(){
        System.out.println("Quantidade de pessoas no evento: "+this.qtdePessoas);
    }
}
