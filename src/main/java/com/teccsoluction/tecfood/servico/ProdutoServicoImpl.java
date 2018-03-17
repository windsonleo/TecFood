package com.teccsoluction.tecfood.servico;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.tecfood.dao.IProdutoDAO;
import com.teccsoluction.tecfood.entidade.Categoria;
import com.teccsoluction.tecfood.entidade.Produto;
import com.teccsoluction.tecfood.framework.AbstractEntityService;

/*  criar validacaoes para que o servico as chamem caso nao haja erros execute a acao  */


@Service("produtoService")
@Transactional
public class ProdutoServicoImpl extends AbstractEntityService<Produto> {

    @Autowired
    private IProdutoDAO dao;


    public ProdutoServicoImpl() {

        super(Produto.class, "produto");

    }

    @Override
    protected JpaRepository<Produto, UUID> getDao() {

        return dao;
    }

    public Produto getProdutoPorCodebar(String codebar) {

        return dao.getProdutoPorCodebar(codebar);
    }

    public List<Produto> getAllProdutoPorCategoria(Categoria idcategoria) {

        return dao.getAllProdutoPorCategoria(idcategoria);
    }

	@Override
	protected void validateSave(Produto post) {
		// TODO Auto-generated method stub
		
	}

    @Override
    protected String getIdEntity(Produto produto) {
        return produto.getId().toString();
    }

    @Override
	protected void validateEdit(Produto post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void validateDelete(UUID id) {
		// TODO Auto-generated method stub
		
	}


}
