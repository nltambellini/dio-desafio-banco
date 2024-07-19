package OperacoesBancarias;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	// Método para imprimir os dados de todos os clientes e suas contas
    public void imprimirDadosClientesEContas() {
        if (contas != null) {
            for (Conta conta : contas) {
                Cliente cliente = conta.cliente;
                System.out.println("Nome do Cliente: " + cliente.getNome());
                System.out.println("CPF do Cliente: " + cliente.getCpf());
                System.out.println("Número da Conta: " + conta.getNumero());
                System.out.println("Saldo da Conta: " + conta.getSaldo());
                System.out.println("-------------------------------------");
            }
        } else {
            System.out.println("Não há contas cadastradas.");
        }
    }
}