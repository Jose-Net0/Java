package exemploencapsulamento1;

public class Formacao {
     public String nivel, instituicao;
     private boolean concluido;
     private int ano;
    
    public Formacao(String nivel, String instituicao, boolean concluido , int ano){
        this.nivel=nivel;
        this.instituicao=instituicao;
        this.concluido=concluido;
        this.ano=ano;
    }
    
    public boolean getConcluido(){
        return concluido;
        
    }
    
    public int getAno(){
        return ano;
    }
    
    public String exibe(){
        return "    FORMAÇÃO\nEscolaridade: "+nivel+"\nInstituição: "+instituicao+"\nConcluído: "+concluido+"\nANO: "+ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
    
}
