package com.teccsoluction.tecfood.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.tecfood.entidade.Categoria;
import com.teccsoluction.tecfood.entidade.Usuario;
import com.teccsoluction.tecfood.framework.AbstractController;
import com.teccsoluction.tecfood.framework.AbstractEditor;
import com.teccsoluction.tecfood.servico.CategoriaServicoImpl;
import com.teccsoluction.tecfood.servico.UsuarioServicoImpl;


@Controller
@RequestMapping("categoria/")
public class CategoriaController extends AbstractController<Categoria> {

	
	private static final Logger logger = LoggerFactory.getLogger(CategoriaController.class);

	private final CategoriaServicoImpl categoriaService;

	private final UsuarioServicoImpl userservice;

	
	
	@Autowired
	public CategoriaController(CategoriaServicoImpl dao, UsuarioServicoImpl daousu) {
		super("categoria");
		this.categoriaService = dao;
		this.userservice = daousu;
	}

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Categoria.class, new AbstractEditor<Categoria>(this.categoriaService) {

		});
	}
	
    @ModelAttribute
    public void addAttributes(Model model) {

        List<Categoria> categoriaList = getservice().findAll();
        model.addAttribute("categoriaList", categoriaList);

//        Usuario usuario = new Usuario();
//        usuario.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());
//        usuario = userservice.findByUsername(usuario.getUsername());
//
//        model.addAttribute("usuarioAtt", usuario);
        
        model.addAttribute("categoria", new Categoria());

    }
    
    
   
    

	@Override
	protected CategoriaServicoImpl getservice() {

		return categoriaService;
	}
    
    

}
