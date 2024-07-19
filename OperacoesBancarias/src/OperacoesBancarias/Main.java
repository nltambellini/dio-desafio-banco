package OperacoesBancarias;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Lista de contas agora é uma variável de classe
    private static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        Cliente ana = new Cliente();
        ana.setNome("Ana");
        ana.setCpf("123456789-00");
        ana.setTelefone("11912345678");

        Conta ccAna = new ContaCorrente(ana);
        Conta poupancaAna = new ContaPoupanca(ana);

        ccAna.depositar(100);
        ccAna.transferir(100, poupancaAna);

        contas.add(ccAna);
        contas.add(poupancaAna);

        Cliente joao = new Cliente();
        joao.setNome("João");
        joao.setCpf("987654321-00");
        joao.setTelefone("11987654321");

        Conta ccJoao = new ContaCorrente(joao);
        Conta poupancaJoao = new ContaPoupanca(joao);

        ccJoao.depositar(200);
        ccJoao.transferir(50, poupancaJoao);

        contas.add(ccJoao);
        contas.add(poupancaJoao);

        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setCpf("111222333-44");
        maria.setTelefone("11911223344");

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        ccMaria.depositar(300);
        ccMaria.transferir(100, poupancaMaria);

        contas.add(ccMaria);
        contas.add(poupancaMaria);

        // Imprime extratos de contas individuais
        ccAna.imprimirExtrato();
        poupancaAna.imprimirExtrato();

        ccJoao.imprimirExtrato();
        poupancaJoao.imprimirExtrato();

        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        // Imprime dados dos clientes e suas contas
        imprimirDadosClientesEContas();
    }

    public static void imprimirDadosClientesEContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
            return;
        }
        System.out.println("-----------LISTA CLIENTES------------");

        for (Conta conta : contas) {
            Cliente cliente = conta.cliente;
            System.out.println("Nome do Cliente: " + cliente.getNome());
            System.out.println("CPF do Cliente: " + cliente.getCpf());
            System.out.println("Telefone do Cliente: " + cliente.getTelefone());
            System.out.println("Agência da Conta: " + conta.getAgencia());
            System.out.println("Número da Conta: " + conta.getNumero());
            System.out.println("Saldo da Conta: " + conta.getSaldo());
            System.out.println("-------------------------------------");
        }
    }
}
