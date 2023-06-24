package com.nagarro.remotelearning;

public interface CustomList<T> {

	void add(T element);
	
	T get(int position);
	
	boolean contains(T element);
	
	boolean containsAll(CustomList<T> foreignList);
	
	int size();
}
