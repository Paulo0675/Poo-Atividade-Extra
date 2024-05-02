import java.util.Calendar;


public class Usuario {
    Calendar data_nascimento = Calendar.getInstance();
    protected int ID;
    public boolean consentimento;
    public String nome,cpf,email,perfil,role,senha;
    public String telefone,estado,municipio,cep;
    public String bairro,logradouro,numero,complemento;

    public Usuario(int ID) {
        this.ID = ID;
    }
}
