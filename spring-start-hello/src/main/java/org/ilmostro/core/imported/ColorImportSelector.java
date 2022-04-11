package org.ilmostro.core.imported;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;

/**
 * @author li.bowei
 */
public class ColorImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(@NonNull AnnotationMetadata importingClassMetadata) {
		return new String[]{GreenColor.class.getName()};
	}
}
