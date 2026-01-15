package teste;

import exemploencapsulamento1.Formacao;
import exemploencapsulamento1.Pessoa;
import javax.swing.JOptionPane;

public class App {

    public static Pessoa lePessoa(){
       String nome;
       char sexo;
       int idade;
       
       nome=JOptionPane.showInputDialog("Digite o nome: ");
       sexo=JOptionPane.showInputDialog("Digite o sexo (m/f): ").charAt(0);
       idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
       Pessoa p = new Pessoa(nome,sexo,idade);
       return p;
    }
    
    public static Formacao leFormacao(){
       String nivel, instituicao;
       char resp;
       boolean concluido;
       int ano;
       
       nivel=JOptionPane.showInputDialog("Digite o nível de escolaridade: ");
       instituicao=JOptionPane.showInputDialog("Digite a instituição: ");
       resp=JOptionPane.showInputDialog("Já concluiu? (s/n)").charAt(0);
       if(resp=='s'||resp=='S')
           concluido=true;
       else
           concluido=false;
       ano=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
       Formacao f = new Formacao(nivel,instituicao,concluido,ano);
       return f;
    }
    
    public static void main(String[] args) {

        Pessoa p1 = lePessoa();
        Formacao f1 = leFormacao();
        
        Pessoa p2 = lePessoa();
        Formacao f2 = leFormacao();
        
        String s1 = p1.exibe()+f1.exibe()+"\n";
        s1 += p2.exibe()+f2.exibe();
        JOptionPane.showMessageDialog(null, s1, "SAÍDA",1);   
        
        int idade = p2.getIdade();
        idade++;
        p2.setIdade(idade);
        f2.setConcluido(true);
        int ano = f2.getAno();
        f2.setAno(++ano);
        
        s1 = "";
        s1+= p1.exibe()+ "\n"+ f1.exibe()+"\n\n";
        s1 += p2.exibe()+f2.exibe();
        JOptionPane.showMessageDialog(null, s1, "SAÍDA",1);  
        
    }
    
}
