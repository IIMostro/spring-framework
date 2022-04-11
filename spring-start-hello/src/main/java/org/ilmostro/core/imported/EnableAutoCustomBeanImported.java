package org.ilmostro.core.imported;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * @author li.bowei
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({
		RedColor.class,
		ColorImportSelector.class,
		ColorConfiguration.class,
		ColorImportBeanDefinitionRegistrar.class
})
public @interface EnableAutoCustomBeanImported {
}
