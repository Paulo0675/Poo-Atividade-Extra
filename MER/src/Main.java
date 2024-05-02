import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);

        Usuario user;
        do {
            int i = 0;
            user = new Usuario(i);
            //Inserção de valores De Usuario
            System.out.println("Informe Seu Nome: ");
            user.nome = teclas.nextLine();
            System.out.println("Informe o Ano de seu nascimento: ");
            int ano = Integer.parseInt(teclas.nextLine());
            user.data_nascimento.set(Calendar.YEAR, ano);
            System.out.println("Você aceita passar suas informações[S/N]: ");
            String op = teclas.nextLine();
            if (op.equalsIgnoreCase("S")) {
                user.consentimento = true;
            } else {
                user.consentimento = false;
                break;
            }
            System.out.println("Informe Seu CPF: ");
            user.cpf = teclas.nextLine();
            System.out.println("Informe Seu E-mail: ");
            user.email = teclas.nextLine();
            System.out.println("Informe Seu Perfil: ");
            user.perfil = teclas.nextLine();
            System.out.println("Informe Seu Role: ");
            user.role = teclas.nextLine();
            System.out.println("Informe Sua Senha: ");
            user.senha = teclas.nextLine();
            System.out.println("Informe Seu Telefone: ");
            user.telefone = teclas.nextLine();
            System.out.println("Informe Seu Estado: ");
            user.estado = teclas.nextLine();
            System.out.println("Informe Seu Municipio: ");
            user.municipio = teclas.nextLine();
            System.out.println("Informe Seu CEP: ");
            user.cep = teclas.nextLine();
            System.out.println("Informe Seu Bairro: ");
            user.bairro = teclas.nextLine();
            System.out.println("Informe Seu Logradouro: ");
            user.logradouro = teclas.nextLine();
            System.out.println("Informe Seu Número: ");
            user.numero = teclas.nextLine();
            System.out.println("Informe Seu Complemento: ");
            user.complemento = teclas.nextLine();
            System.out.println(user.nome);
            System.out.println(user.data_nascimento.get(Calendar.YEAR));
            //<!--Fim do Cadastro do Usuário-->

            Sorteio sorteio = new Sorteio(0);
            //Inserção de Sorteios
            System.out.println("Informe o Número do Identificador: ");
            sorteio.identificador = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Mês: ");
            sorteio.mes = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Valor do Prémio: ");
            sorteio.valor_premio = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Número do Auditor: ");
            sorteio.auditor = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Número do Premiado: ");
            sorteio.premiado = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Tipo de Prémio: ");
            sorteio.tipo = teclas.nextLine();
            System.out.println(sorteio.identificador);
            //<!--Fim do Cadastro de Sorteios-->

            NotaFiscal nota_fiscal = new NotaFiscal(0, user.ID);
            //Insersão da NotaFiscal
            System.out.println("Informe a Chave: ");
            nota_fiscal.chave = teclas.nextLine();
            System.out.println("Informe a sequencial: ");
            nota_fiscal.sequencial = teclas.nextLine();
            int ano2 = Integer.parseInt(teclas.nextLine());
            nota_fiscal.data_processamento.set(Calendar.YEAR, ano2);
            System.out.println(nota_fiscal.data_processamento);
            //<!--Fim Inserção da NotaFiscal-->

            Bilhete bilhete = new Bilhete(0, user.ID, nota_fiscal.ID);
            //Inserção do Bilhete
            System.out.println("Informe o Mês: ");
            bilhete.mes = Integer.parseInt(teclas.nextLine());
            System.out.println("Informe o Número: ");
            bilhete.numero = Integer.parseInt(teclas.nextLine());
            System.out.println(bilhete.mes);
            //<!--Fim da Inserção de Bilhete-->
            i++;
        } while (true);


    }
}