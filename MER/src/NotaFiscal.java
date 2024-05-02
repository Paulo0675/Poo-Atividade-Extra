import java.util.Calendar;

public class NotaFiscal {
    protected int ID;
    protected int usuario_ID;
    public String chave;
    public String sequencial;
    Calendar data_processamento = Calendar.getInstance();

    public NotaFiscal(int ID,int usuario_ID){
        this.ID = ID;
        this.usuario_ID = usuario_ID;
    }
}
