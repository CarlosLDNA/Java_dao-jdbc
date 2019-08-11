package application;

import java.util.List;

//import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department department = new Department(1, "Livros"); 
		//Seller seller = new Seller(21, "Carlos", "carlos@teste.com", new Date(), 6000.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===== teste 1 Seller FindById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== teste 2 Seller FindByDepartment ======");		
		Department department = new Department(2, null);	
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list ) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== teste 3 Seller FindByAll ======");			
		list = sellerDao.findAll();
		for (Seller obj : list ) {
			System.out.println(obj);
		}
	}

}
