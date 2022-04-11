package org.ilmostro.core.imported;

import org.springframework.context.annotation.Bean;

/**
 * @author li.bowei
 */
public class ColorConfiguration {

	@Bean
	public Color blue(){
		return new BlueColor();
	}
}
