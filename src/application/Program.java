package application;

//import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
//import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department department = new Department(1, "Livros"); 
		//Seller seller = new Seller(21, "Carlos", "carlos@teste.com", new Date(), 6000.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
				
		System.out.println(seller);
	}

}
