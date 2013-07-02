package org.testshop.store;

public interface IPage<T extends IPage<T>> {

	T get();

}
