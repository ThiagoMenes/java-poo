package edu.thiago.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Júnior");
        felipe.setIdade (12);
        
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos 		
    }
}