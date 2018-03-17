package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teccsoluction.tecfood.entidade.CarrinhoCompra;

	


@Repository
public interface ICarrinhoCompraDAO extends JpaRepository<CarrinhoCompra, UUID> {
	
//    @Query("SELECT p FROM Categoria p where p.catpai=(SELECT id FROM Categoria m  where m.nome='PAI')")
//    public List<Categoria> getCategoriaPai();
//    
//    @Query("SELECT p FROM Categoria p where p.catpai=(:catpai)")
//    public List<Categoria> getCategoriasFilho(@Param("catpai")UUID idPai);
//    
//    @Query("SELECT p FROM Categoria p where p.nome='PAI'")
//    public Categoria getOnlyCategoriaPai();
//    
//    @Query("SELECT p FROM Categoria p where p.nome='INSUMOS'")
//    public Categoria getOnlyCategoriaExcludeCardapio();

}
