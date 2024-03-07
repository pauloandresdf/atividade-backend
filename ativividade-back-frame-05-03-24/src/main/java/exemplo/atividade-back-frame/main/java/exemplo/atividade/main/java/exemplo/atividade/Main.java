package main.java.exemplo.atividade-back-frame;

public class Main {
    public static void main(String[] args) {
       
        Pessoa pessoa = new Pessoa("Maria", "Silva", "01/01/1990", "maria.silva@example.com", "(11) 91234-5678");
        
       
        pessoa.andar();
        pessoa.comer();
        pessoa.correr();
        pessoa.dormir();
        
        pessoa.mostrarInformacoes();
    }
