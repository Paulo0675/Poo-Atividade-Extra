public class Bilhete {
    protected int ID;
    public int mes;
    public int numero;
    protected int nota_fiscal_ID;
    protected int usuario_ID;

    public Bilhete(int ID,int usuario_ID,int nota_fiscal_ID){
        this.ID = ID;
        this.usuario_ID = usuario_ID;
        this.nota_fiscal_ID = nota_fiscal_ID;
    }

}
