public class BilheteEvento{
    private int statusBilhete;

    public BilheteEvento(int bilhete){
        this.statusBilhete = 0;
    }
    public int getStatusBilhete(){
        return statusBilhete;
    }
    public void entrada(){
        this.statusBilhete = 1;
    }
    public void saida(){
        if (statusBilhete == 1) {
            this.statusBilhete = 2;
        }else{
            System.out.println("Bilhete não registrado");
        }
    }
    public void imprime(){
        String status;
        switch (this.statusBilhete) {
            case 0:
                status = ("Bilhete não utilizado");
                break;
            case 1:
                status = ("Entrada realizada");
                break;
            case 2:
                status = ("Saída realizada");
                break;
            default:
            status = ("Bilhete não encontrado");
                break;
        }
        System.out.println("Estado do bilhete: "+status);
    }
}