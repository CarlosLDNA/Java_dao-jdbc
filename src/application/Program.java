package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
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
		
		System.out.println("\n===== teste 4 Seller Insert ======");	
		Seller newSeller = new Seller(null, "Gorete", "gorete@teste.com", new Date(), 6000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n===== teste 5 Seller Update ======");		
		seller = sellerDao.findById(1);
		seller.setName("Martha Kent");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		System.out.println("\n===== teste 6 Seller Delete ======");			
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Copmpleted!");
		
		sc.close();
		
	}

}
