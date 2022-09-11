package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		 List<String> dato1=new ArrayList<>();
		 List<String> dato2=new ArrayList<>();
		 
		 Main m=new Main();
		 dato1 =m.CargadarDatos();
		 dato2 =m.CargadarDatos();
		
		Conjuntos p=new Conjuntos<>(dato1, dato2);

	}
	
	public List<String> CargadarDatos() {
		String dt="";
		List<String> datos= new ArrayList<>();
		Boolean exit=true;
		System.out.println("dijite no para salir de esta conjunto");
		do {
			System.out.println("dijite atrivuto del conjunto");
			dt=sc.next();
			if(dt=="no") {
				exit=false;
			}else {
				datos.add(dt);
			}
			
		} while (exit=true);
		return datos;
	}
	

}
