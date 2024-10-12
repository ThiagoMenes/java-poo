package edu.thiago.construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema já informando o CPF e nome, solicitados através
        //do método construtor
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
