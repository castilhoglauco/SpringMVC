package org.casadocodigo2.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("passei pelo getServletConfigClasses");
		return new Class[] {AppWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("passei pelo getServletMappings");
		return new String[] {"/"}; 
	}

	
}
