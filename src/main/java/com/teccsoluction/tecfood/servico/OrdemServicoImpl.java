package com.teccsoluction.tecfood.servico;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.tecfood.dao.IOrdemDAO;
import com.teccsoluction.tecfood.entidade.Ordem;
import com.teccsoluction.tecfood.framework.AbstractEntityService;


@Service("ordemService")
@Transactional
public class OrdemServicoImpl extends AbstractEntityService<Ordem> {


    @Autowired
    private
    IOrdemDAO dao;

//	private Entity entityClass;


    public OrdemServicoImpl() {
        super(Ordem.class, "ordem");
    }

@Override
protected JpaRepository<Ordem, UUID> getDao() {
	// TODO Auto-generated method stub
	return dao;
}

@Override
protected void validateSave(Ordem post) {
	// TODO Auto-generated method stub
	
}

@Override
protected String getIdEntity(Ordem entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
protected void validateEdit(Ordem post) {
	// TODO Auto-generated method stub
	
}

@Override
protected void validateDelete(UUID id) {
	// TODO Auto-generated method stub
	
}

  

}
