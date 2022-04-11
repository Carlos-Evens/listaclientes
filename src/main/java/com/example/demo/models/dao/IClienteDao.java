package com.example.demo.models.dao;

import java.util.List;

import com.example.demo.models.entity.Cliente;

public interface IClienteDao {
public List<Cliente>findAll();
public void save(Cliente cliente);
public Cliente findOne(Long id);
}
