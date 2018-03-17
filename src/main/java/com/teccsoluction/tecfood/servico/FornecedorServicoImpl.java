package com.teccsoluction.tecfood.servico;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.tecfood.dao.IFornecedorDAO;
import com.teccsoluction.tecfood.entidade.Fornecedor;
import com.teccsoluction.tecfood.framework.AbstractEntityService;

/*  criar validacaoes para que o servico as chamem caso nao haja erros execute a acao  */


@Service("fornecedorService")
@Transactional
public class FornecedorServicoImpl extends AbstractEntityService<Fornecedor> {

    @Autowired
    private IFornecedorDAO dao;


    public FornecedorServicoImpl() {

        super(Fornecedor.class, "fornecedor");

    }

    @Override
    protected JpaRepository<Fornecedor, UUID> getDao() {

        return dao;
    }

    @Override
    protected void validateSave(Fornecedor post) {
        // TODO Auto-generated method stub

    }

    @Override
    protected String getIdEntity(Fornecedor fornecedor) {
        return fornecedor.getId().toString();
    }

    @Override
    protected void validateEdit(Fornecedor post) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void validateDelete(UUID id) {
        // TODO Auto-generated method stub

    }


}
