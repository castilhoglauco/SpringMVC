package org.casadocodigo2.loja.conf;

import org.casadocodigo2.loja.controllers.HomeController;
import org.casadocodigo2.loja.daos.ProdutoDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, ProdutoDAO.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		System.out.println("passei pelo InternalResourceViewResolver");
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver; 
	}
}
