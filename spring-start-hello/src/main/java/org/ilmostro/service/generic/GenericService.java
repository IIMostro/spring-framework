package org.ilmostro.service.generic;

/**
 * @author li.bowei
 */
public interface GenericService<T extends Object> {

	void say(T data);
}
