package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teccsoluction.tecfood.entidade.Empresa;


public interface IEmpresaDAO extends JpaRepository<Empresa, UUID> {
}
