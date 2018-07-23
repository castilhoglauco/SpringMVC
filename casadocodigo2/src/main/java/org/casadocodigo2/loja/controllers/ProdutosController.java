package org.casadocodigo2.loja.controllers;

import org.casadocodigo2.loja.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos")
	public String form()  {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos2")
	public String grava(Produto produto) {
		System.out.println(produto.toString());
		return "produtos/ok";
	}

}
