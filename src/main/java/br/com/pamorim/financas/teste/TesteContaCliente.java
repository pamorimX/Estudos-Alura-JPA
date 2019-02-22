package br.com.pamorim.financas.teste;

import javax.persistence.EntityManager;

import br.com.pamorim.financas.modelo.Cliente;
import br.com.pamorim.financas.modelo.Conta;
import br.com.pamorim.financas.util.JPAUtil;

public class TesteContaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		cliente.setEndereco("Rua qualquer");
		cliente.setProfissao("Professor");

		Conta conta = new Conta();
		conta.setId(2);

		cliente.setConta(conta);

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.persist(cliente);

		em.getTransaction().commit();
		em.close();

	}

}
