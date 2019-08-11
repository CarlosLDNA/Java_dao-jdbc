package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department department = new Department(1, "Livros");
      
		Seller seller = new Seller(21, "Carlos", "carlos@teste.com", new Date(), 6000.0, department);
				
		System.out.println(seller);
	}

}
