package ui;

import java.util.*;

public class Conjuntos<T>{
    
	private List<T> dato1;
	private List<T> dato2;
	private List<T> operation;
	public Conjuntos(List<T> dato1, List<T> dato2) {
		super();
		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	
	
	public List<T> Union() {

        for (int i = 0; i < dato1.size(); i++) {
        	operation.add(dato1.get(i));
        }
        for (int j = 0; j < dato2.size(); j++) {
        	operation.add(dato2.get(j));
        }

        return operation;
    }
	
	public List<T> Interseccion() {
        for (int i = 0; i <dato1.size() ; i++) {
            for (int j = 0; j < dato2.size(); j++) {
                if (dato1.get(i).equals(dato2.get(j)) ) {
                	operation.add(dato1.get(i));
                }
            }
        }
        return operation;
    }
	
	public List<T> Diferencia() {
        for (int i = 0; i <dato1.size() ; i++) {
            for (int j = 0; j < dato2.size(); j++) {
                if (!dato1.get(i).equals(dato2.get(j)) ) {
                	operation.add(dato1.get(i));
                }
            }
        }
        return operation;
    }
	
	public List<T> Complemento() {
        for (int i = 0; i <dato1.size() ; i++) {
            for (int j = 0; j < dato2.size(); j++) {
                if (!dato2.get(i).equals(dato1.get(j)) ) {
                	operation.add(dato2.get(i));
                }
            }
        }
        return operation;
    }
	
	
	public List<T> getDato1() {
		return dato1;
	}
	public void setDato1(List<T> dato1) {
		this.dato1 = dato1;
	}
	public List<T> getDato2() {
		return dato2;
	}
	public void setDato2(List<T> dato2) {
		this.dato2 = dato2;
	}
	
	
}