package com.teccsoluction.tecfood.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.tecfood.entidade.Cliente;
import com.teccsoluction.tecfood.framework.AbstractRestController;
import com.teccsoluction.tecfood.servico.ClienteServicoImpl;

@RestController
@RequestMapping(value = "cliente")
public class ClienteControllerRest extends AbstractRestController<Cliente> {

    private final
    ClienteServicoImpl clienteService;

    @Autowired
    public ClienteControllerRest(ClienteServicoImpl dao) {
        this.clienteService = dao;
    }


    @Override
    protected ClienteServicoImpl getservice() {

        return clienteService;
    }
}
