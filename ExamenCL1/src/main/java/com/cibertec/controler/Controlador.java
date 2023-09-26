package com.cibertec.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.interfaceService.IEmpleadoService;
import com.cibertec.interfaces.IEmpleado;

@Controller
@RequestMapping
public class Controlador<empleado> {
	
	@Autowired
	private  IEmpleadoService service;
	
	@GetMapping("/listar")
			public String listar (Model model) {
				List<IEmpleado>empleado = service.listar();
				model.addAttribute("empleado", empleado);
				 return "index";
			}
}
