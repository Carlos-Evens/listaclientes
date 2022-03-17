package com.example.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entity.Cliente;

@Repository
public class ClienteDaoImpl implements IClienteDao {
@PersistenceContext

	private EntityManager em;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
	}
	@Override
	@Transactional
	public void save(Cliente cliente) {
em.persist(cliente);		
	}


}