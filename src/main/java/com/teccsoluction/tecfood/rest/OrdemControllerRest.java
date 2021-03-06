package com.teccsoluction.tecfood.rest;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.tecfood.entidade.Ordem;
import com.teccsoluction.tecfood.framework.AbstractRestController;
import com.teccsoluction.tecfood.servico.OrdemServicoImpl;

@RestController
@RequestMapping(value = "ordemService")
public class OrdemControllerRest extends AbstractRestController<Ordem> {

    private
    OrdemServicoImpl pedidovendaService;
    

    @Autowired
    public OrdemControllerRest(OrdemServicoImpl dao) {
      
    	this.pedidovendaService = dao;
    }
    
//    @RequestMapping(value="/pormesa/{id}",method = RequestMethod.GET)
//    public List<Ordem> listarPedidoPorMesa(@PathVariable String id) {
//    	UUID idf = UUID.fromString(id);
//    	return pedidovendaService.getAllPedidoPorMesa(idf);
//
//    }
    
//    @RequestMapping(value="/status/{status}",method = RequestMethod.GET)
//    public List<Ordem> listarPedidoPorStatus(@PathVariable String status) {
////    	UUID idf = UUID.fromString(id);
////    	String statusped = "FECHADO";
//    	return pedidovendaService.findAllByStatusIsAndSituacaoIs(status);
//
//    }

    


	@Override
	protected OrdemServicoImpl getservice() {

		return pedidovendaService;
	}
    
//    @RequestMapping(value = "/enviar",method = RequestMethod.POST)
//    public ResponseEntity EnviarEntity(PedidoVenda entity) {
//
//        try {
//            getDao().add(entity);
//            return new ResponseEntity<>(entity, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
//        }
//    }

}
