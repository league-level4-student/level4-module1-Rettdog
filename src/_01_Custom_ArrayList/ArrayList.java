package _01_Custom_ArrayList;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;

	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return array[loc];
	}
	
	public void add(T val) {
		T[] temp;
		if(array != null) {
			temp = (T[]) new Object[array.length+1];
		}else {
			temp = (T[]) new Object[1];
		}
		for(int i = 0;i<array.length;i++) {
			temp[i] = array[i];
		}
		temp[temp.length-1]=val;
		array=temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp;
		if(array != null) {
			temp = (T[]) new Object[array.length+1];
		}else {
			temp = (T[]) new Object[1];
		}
		for(int i = 0;i<loc;i++) {
			temp[i] = array[i];
		}
		for(int i = loc;i<array.length;i++) {
			temp[i+1] = array[i];
		}
		temp[loc]=val;
		array=temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp;
		if(array != null) {
			temp = (T[]) new Object[array.length+1];
		}else {
			temp = (T[]) new Object[1];
		}
		for(int i = 0;i<loc;i++) {
			temp[i] = array[i];
		}
		for(int i = loc;i<array.length;i++) {
			temp[i] = array[i];
		}
		temp[loc]=val;
		array=temp;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp;
			temp = (T[]) new Object[array.length-1];
		for(int i = 0;i<loc;i++) {
			temp[i] = array[i];
		}
		for(int i = loc+1;i<array.length;i++) {
			temp[i-1] = array[i];
		}
		
		array=temp;
	}
	
	public boolean contains(T val) {
		for(int i = 0;i<array.length;i++) {
			if(array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return array.length;
	}
}