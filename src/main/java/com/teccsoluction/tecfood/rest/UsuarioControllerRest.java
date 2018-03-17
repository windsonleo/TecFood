package com.teccsoluction.tecfood.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.tecfood.entidade.Usuario;
import com.teccsoluction.tecfood.framework.AbstractRestController;
import com.teccsoluction.tecfood.servico.UsuarioServicoImpl;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioControllerRest extends AbstractRestController<Usuario> {

    private final UsuarioServicoImpl userService;


    @Autowired
    public UsuarioControllerRest(UsuarioServicoImpl dao) {
        this.userService = dao;
    }

    @Override
    protected UsuarioServicoImpl getservice() {
        // TODO Auto-generated method stub
        return userService;
    }


}
