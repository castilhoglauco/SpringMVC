package org.casadocodigo2.loja.controllers;

import org.casadocodigo2.loja.daos.ProdutoDAO;
import org.casadocodigo2.loja.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("produtos/tela")
	public String form()  {
		System.out.println("passei pelo form");
		return "produtos/form";
	}
	
	@RequestMapping("/produtos2")
	public String grava(Produto produto) {
		System.out.println("passei pelo grava");
		System.out.println(produto.toString());
		produtoDAO.gravar(produto);
		return "produtos/ok"; 
	}

}
