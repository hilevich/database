package console;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import dao.ModelPhoneDao;
import dao.RepairsDao;
import entity.ModelPhone;
import entity.Repairs;

public class ConcoleOut {
	
	public void Menu(){
		
		System.out.println("1 - add new Phone");
		System.out.println("2 - remove Phone");
		System.out.println("3 - seach All Phones");
		System.out.println("4 - seach one phones");
		System.out.println("5 - add new repair");
		System.out.println("6 - remove repair");
		System.out.println("7 - seach all repair");
		System.out.println("8 - seach one repair");
		System.out.println("9 - edit one repair");
		System.out.println("0 - exit");
		
		
	}
	
	
	public void switchMenu(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");

		EntityManager manager = factory.createEntityManager();
		
		ModelPhoneDao mpd = new ModelPhoneDao(manager);
		
		RepairsDao rd = new RepairsDao(manager);
		
		boolean flag = true;
		
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(flag){
			Menu();
		switch (sc.nextLine()) {
		case "1" :{
			System.out.println("1 - add new Phone");
			System.out.println("Enter new name of Phone");	
			//mpd.savePhone(new ModelPhone(sc.nextLine()));			
			
			break;
		}
		case "2" :{
			System.out.println("2 - remove Phone");
			System.out.println("Enter remove name of Phone");
			mpd.deletePhone(sc.nextLine());
			
			break;
		}
		case "3" :{
			System.out.println("3 - seach All Phones");
			for (ModelPhone phone : mpd.findAll()) {
				System.out.println(phone);
			}
			
			
			break;
		}
		case "4" :{
			System.out.println("4 - seach one phones");
			
			System.out.println("Enter seach name of Phone");
			
			System.out.println(mpd.finOne(sc.nextLine()));
			
			break;
		}
		case "5" :{
			System.out.println("5 - add new repair");
			System.out.println("enter new name of repair");
			
			String nameRepairs = sc.nextLine();
			
			System.out.println("enter new price of repair");
			double price = 0;
			try {
			
				price = sc.nextDouble();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			System.out.println("enter new type  of repair ");
			
			String typeRepairs = sc.nextLine();
			
		//	rd.addNewRepair(new Repairs(price, nameRepairs, typeRepairs));
			
			break;
		}
		case "6" :{
			System.out.println("6 - remove repair");
			System.out.println("enter name repair");
			rd.removeRepair(sc.nextLine());
			
			
			break;
		}
		case "7" :{
			System.out.println("7 - seach all repair");
			
			for (Repairs repair : rd.seachAllRepair()) {
				System.out.println(repair);
			}
			
			
			break;
		}
		case "8" :{
			System.out.println("8 - seach one repair");
			System.out.println("enter name repair");
			rd.editOneRepair(sc.nextLine());
			
			break;
		}
		case "9" :{
			System.out.println("9 - edit one repair");
			System.out.println("enter name repair");
			rd.editOneRepair(sc.nextLine());
			break;
		}
		case "0" :{
			System.out.println("0 - exit");
			flag = false;
			break;
		}

		}
	}

		manager.close();

		factory.close();
	}
}
