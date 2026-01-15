package exemploencapsulamento1;

public class Pessoa {
    public String nome;
    public char sexo;
    int idade;
    
    public Pessoa(String nome, char sexo, int idade){
        this.nome=nome;
        this.sexo=sexo;
        this.idade=idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String exibe(){
        return "    CADASTRO\nNOME: "+nome+"\nSEXO: "+sexo+"\nIDADE: "+idade;
    }

  /*  public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } */
}
