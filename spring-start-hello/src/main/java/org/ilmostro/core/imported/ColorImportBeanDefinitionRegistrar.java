package org.ilmostro.core.imported;

import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author li.bowei
 */
public class ColorImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata metadata,
			BeanDefinitionRegistry registry) {
		RootBeanDefinition definition = new RootBeanDefinition(OrangeColor.class);
		registry.registerBeanDefinition(BeanDefinitionReaderUtils.generateBeanName(definition, registry),
				definition);
	}
}
