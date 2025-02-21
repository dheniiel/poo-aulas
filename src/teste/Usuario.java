package teste;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 *
 * @author aluno
 */
public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;
    
    
    public void consultaMedicamento(){  
        System.out.println("Esse método consulta medicamento");
    }
    public void comprarMedicamento(){
        System.out.println("Esse método compra medicamento");
    }
    public void efetuaPagamento(){
        System.out.println("Esse método efetua o pagamento");
    }
    public int getId(){
        return this.id;
    }
    public int setId(int id){
        this.id = id;
        return 0;
    }
                   
    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
        this.nome = nome;
        return "0";
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    public String setEndereco(String endereco){
        this.endereco = endereco;
        return "0";
    }
    
    public String getEmail(){
        return this.email;
    }
    public String setEmail(String email){
        this.email = email;
        return "0";
    }
    
    public byte getReceita(){
        return this.receita;
    }
    public byte setReceita(byte receita){
        this.receita = receita;
        return 0;
    }
    private static final Logger LOG = Logger.getLogger(Usuario.class.getName());
    
    public static double cacularImposto(double valorMedicamento){
        if (valorMedicamento > 100){
            double valorImposto  = valorMedicamento * 0.15;
            System.out.println("O valor do imposto sobre o medicamento é: " + valorImposto);
        }else if(valorMedicamento <= 100){
            double valorImposto = valorMedicamento * 0.10;
            System.out.println("O valor do imposto sobre o medicamento é: " + valorImposto);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor do medicamento: ");
        double valorMedicamento = scan.nextDouble();
        scan.nextLine();
        
        cacularImposto(valorMedicamento);
    }
}
