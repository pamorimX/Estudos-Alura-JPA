package br.com.pamorim.financas.teste;

import javax.persistence.EntityManager;
import br.com.pamorim.financas.modelo.Conta;
import br.com.pamorim.financas.util.JPAUtil;

public class TestaConta {

	public static void main(String args[]) {

		Conta conta = new Conta();
		conta.setId(1);
		conta.setNumero("311");
		conta.setTitular("6546");
		conta.setBanco("Itau");
		conta.setAgencia("654");

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		conta = em.find(Conta.class, 1);
		em.remove(conta);
		em.getTransaction().commit();

		em.close();

	}

}
