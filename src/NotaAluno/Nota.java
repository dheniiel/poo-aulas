package NotaAluno;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quantos alunos você quer cadastrar: ");
        int quantidadeX = scan.nextInt(); scan.nextLine();
        
        Aluno[] alunos = new Aluno[quantidadeX];
        
        System.out.println(alunos.length);
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: ");
            String nome = scan.nextLine();
            alunos[i].setNome(nome);
            
            System.out.println("Digite a nota do aluno: ");
            double nota = scan.nextDouble(); scan.nextLine();
            alunos[i].setNota(nota);
        }
        
        double maiorNota = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].getNota() > maiorNota){
                maiorNota = alunos[i].getNota();
            }
        }
        System.out.println(maiorNota);
        
        double menorNota = 100000;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].getNota() < menorNota)
                menorNota = alunos[i].getNota();
        }
        System.out.println(menorNota);
        
        
        double soma  = 0;
        for(int i = 0; i < alunos.length; i++){
            soma = soma + alunos[i].getNota();
        }
        double media = soma / alunos.length;
        System.out.println(media);
    }
    
}
