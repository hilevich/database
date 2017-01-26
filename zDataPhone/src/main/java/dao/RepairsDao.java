package dao;



import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import entity.Repairs;



public class RepairsDao {

	final EntityManager manager;
	
	public RepairsDao(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	
	public void addNewRepair (Repairs repair) {
		manager.getTransaction().begin();
		manager.persist(repair);
		manager.getTransaction().commit();

	}
	
	public Repairs seachOneRepair(String nameRepair) {

		Repairs repair = (Repairs) manager.createQuery("select r from Repairs p where p.name_repairs =:param")
				.setParameter("param", nameRepair).getSingleResult();
				
		return repair;

	}

	
	public void removeRepair(String nameRepair) {
		manager.getTransaction().begin();
		manager.remove(seachOneRepair(nameRepair));
		manager.getTransaction().commit();
	}
	
	public List<Repairs> seachAllRepair(){
		manager.getTransaction().begin();
		List<Repairs> allRepairs = manager.createQuery("from Repairs").getResultList();
		manager.getTransaction().commit();
		
		return allRepairs;
	
	}
	
	public void editOneRepair(String nameRepair) {
		manager.getTransaction().begin();
		
		Repairs repair = seachOneRepair(nameRepair);
		Scanner sc = new Scanner(System.in);
		System.out.println("do u want change name y/anything?");
		if(sc.nextLine().equalsIgnoreCase("y")){
			System.out.println("Enter new Name");
		repair.setNameRepairs(sc.nextLine());
		}
		System.out.println("do u want change price y/anything?");
		if(sc.nextLine().equalsIgnoreCase("y")){
			System.out.println("Enter new Price");
			try {
				repair.setPrice(sc.nextDouble());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("do u want change type of price y/anything?");
		if(sc.nextLine().equalsIgnoreCase("y")){
			System.out.println("Enter new type of price");
		repair.setTypeRepairs(sc.nextLine());
		}
		manager.getTransaction().commit();
		
	}
	
	
}
