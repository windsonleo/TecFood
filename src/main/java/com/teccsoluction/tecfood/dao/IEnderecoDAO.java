package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teccsoluction.tecfood.entidade.Endereco;


public interface IEnderecoDAO  extends JpaRepository<Endereco, UUID> {
}
