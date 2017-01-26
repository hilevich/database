package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entity.ModelPhone;


public class ModelPhoneDao {

	final EntityManager manager;
	
	public ModelPhoneDao(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	
	public void savePhone(ModelPhone phone) {
		manager.getTransaction().begin();
		manager.persist(phone);
		manager.getTransaction().commit();

	}
	
	public ModelPhone finOne(String namePhone) {

		ModelPhone phone = (ModelPhone) manager.createQuery("select p from Model_Phone p where p.name_of_phone =:param")
				.setParameter("param", namePhone).getSingleResult();
				System.out.println(phone);
		return phone;

	}

	
	public void deletePhone(String nameOfPhone) {
		manager.getTransaction().begin();
		manager.remove(finOne(nameOfPhone));
		manager.getTransaction().commit();
	}
	
	public List<ModelPhone> findAll(){
		manager.getTransaction().begin();
		List<ModelPhone> allPhones = manager.createQuery("from Model_Phone").getResultList();
		manager.getTransaction().commit();
		System.out.println(allPhones);
		return allPhones;
	
	}
}


