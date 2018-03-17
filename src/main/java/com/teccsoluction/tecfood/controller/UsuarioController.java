package com.teccsoluction.tecfood.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.tecfood.entidade.Cliente;
import com.teccsoluction.tecfood.entidade.Role;
import com.teccsoluction.tecfood.entidade.Usuario;
import com.teccsoluction.tecfood.framework.AbstractEditor;
import com.teccsoluction.tecfood.servico.RoleServicoImpl;
import com.teccsoluction.tecfood.servico.UsuarioServicoImpl;


@Controller
@RequestMapping("usuario/")
public class UsuarioController extends com.teccsoluction.tecfood.framework.AbstractController<Usuario> {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	
	 private final RoleServicoImpl roleservico;
	 
	 private final UsuarioServicoImpl ususervice;
	
	
    public UsuarioController(RoleServicoImpl roleimpl,UsuarioServicoImpl usuimpl) {
		super("usuario");
		this.roleservico = roleimpl;
		this.ususervice = usuimpl;
		
	}


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Role.class, new AbstractEditor<Role>(this.roleservico) {
        });

    }
	
    @ModelAttribute
    public void addAttributes(Model model) {

    	
    	List<Role> roles = roleservico.findAll();

        Usuario usuario = new Usuario();
        usuario.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        usuario = ususervice.findByUsername(usuario.getUsername());

                
        model.addAttribute("usuarioAtt", usuario);
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("roles", roles);

        

    }
    
    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public ModelAndView profileUsuario(HttpServletRequest request) {

        UUID idf = UUID.fromString(request.getParameter("id"));

        ModelAndView profileusuario = new ModelAndView("/public/profile");

        Usuario usuario = getservice().findOne(idf);

        profileusuario.addObject("usuario", usuario);

        return profileusuario;
    }

	@Override
	protected UsuarioServicoImpl getservice() {

		return ususervice;
	}
    
    

}
