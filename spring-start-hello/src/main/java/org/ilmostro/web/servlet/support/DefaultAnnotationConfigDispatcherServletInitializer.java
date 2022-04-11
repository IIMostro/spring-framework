package org.ilmostro.web.servlet.support;

import org.ilmostro.web.configuration.DispatcherServletConfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * Spring WebMvc实现自动装配，这里开始取消web.xml的使用
 *
 * @author li.bowei
 */
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// web.xml
		return new Class[]{DispatcherServletConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// DispatcherServlet
		/*
			<servlet>
				<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
			</servlet>
		 */
		return new Class[]{org.springframework.web.servlet.DispatcherServlet.class};
	}

	@Override
	protected String[] getServletMappings() {
		/*
			<servlet-mapping>
				<url-pattern>/</url-pattern>
			</servlet-mapping>
		*/
		return new String[]{"/"};
	}
}
