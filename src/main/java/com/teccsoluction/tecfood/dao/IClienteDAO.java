package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teccsoluction.tecfood.entidade.Cliente;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente, UUID> {


    @Query("SELECT p FROM Cliente p where p.telefone=:telefone")
    Cliente getClienteporTelefone(@Param("telefone") String tel);

//    List<Cliente> findClientesByListaPedidoVendaIsNotNull();

}
