package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teccsoluction.tecfood.entidade.Fornecedor;

@Repository
public interface IFornecedorDAO extends JpaRepository<Fornecedor, UUID> {
}
