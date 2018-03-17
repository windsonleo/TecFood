package com.teccsoluction.tecfood.servico;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.tecfood.dao.IUsuarioDAO;
import com.teccsoluction.tecfood.entidade.Usuario;
import com.teccsoluction.tecfood.framework.AbstractEntityService;

/*  criar validacaoes para que o servico as chamem caso nao haja erros execute a acao  */


@Service("userService")
@Transactional
//@PersistenceContext
public class UsuarioServicoImpl extends AbstractEntityService<Usuario> {


    @Autowired
    private IUsuarioDAO dao;


    public UsuarioServicoImpl() {

        super(Usuario.class, "usuario");


    }
    
    @Override
    public Usuario save(Usuario user) {

//		user.setRoles(new HashSet<>());
//		userRepository.save(user);
        dao.saveAndFlush(user);

        return user;

    }


    public Usuario findByUsername(String username) {

        return dao.findByUsername(username);
    }


    @Override
    protected JpaRepository<Usuario, UUID> getDao() {

        return dao;
    }


    @Override
    protected void validateSave(Usuario post) {
        // TODO Auto-generated method stub

    }

    @Override
    protected String getIdEntity(Usuario usuario) {
        return usuario.getId().toString();
    }


    @Override
    protected void validateEdit(Usuario post) {
        // TODO Auto-generated method stub

    }


    @Override
    protected void validateDelete(UUID id) {
        // TODO Auto-generated method stub

    }


}
