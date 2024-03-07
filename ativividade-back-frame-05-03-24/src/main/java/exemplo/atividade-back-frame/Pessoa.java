package main.java.exemplo.atividade-back-frame;

public class Pessoa {
    
    String nome;
    String sobrenome;
    String dataNascimento; 
    String email;
    String telefone;
    
    
    final String CPF = "123.456.789-00";
    final String PAIS_NACIONALIDADE = "Brasil";

    
    public Pessoa(String nome, String sobrenome, String dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    
    public void andar() {
        System.out.println(this.nome + " está andando.");
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    public void correr() {
        System.out.println(this.nome + " está correndo.");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo.");
    }

    
    public void exibirInformacoes() {
        System.out.println(nome + " " + sobrenome);
        System.out.println(email + " - " + dataNascimento + " - " + telefone);
        System.out.println("País de Nacionalidade: " + PAIS_NACIONALIDADE);
    }
}
}



