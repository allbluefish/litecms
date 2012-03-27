package com.allbluefish.cms.service;

public interface BasicService<T> {

	void save(T t);

	void delete(T t);

	void update(T t);

	T findById(Integer id);

}
