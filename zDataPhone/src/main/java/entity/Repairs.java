package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table (name="repairs")
public class Repairs{

	@Id
	@Column(name = "id_Repairs")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRepairs;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "name_repairs")
	private String nameRepairs;
	
	@Column(name = "type_repairs")
	private String typeRepairs;
	
	@OneToMany(mappedBy="repairs")
	private List<ModelPhoneHasRepairs> modelPhoneHasRepairs;
	
	public Repairs() {
		super();
	}


	public int getIdRepairs() {
		return idRepairs;
	}

	public void setIdRepairs(int idRepairs) {
		this.idRepairs = idRepairs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameRepairs() {
		return nameRepairs;
	}

	public void setNameRepairs(String nameRepairs) {
		this.nameRepairs = nameRepairs;
	}

	public String getTypeRepairs() {
		return typeRepairs;
	}

	public void setTypeRepairs(String typeRepairs) {
		this.typeRepairs = typeRepairs;
	}

	public List<ModelPhoneHasRepairs> getModelPhoneHasRepairs() {
		return modelPhoneHasRepairs;
	}

	public void setModelPhoneHasRepairs(List<ModelPhoneHasRepairs> modelPhoneHasRepairs) {
		this.modelPhoneHasRepairs = modelPhoneHasRepairs;
	}

	@Override
	public String toString() {
		return "Repairs [idRepairs=" + idRepairs + ", price=" + price + ", nameRepairs=" + nameRepairs
				+ ", typeRepairs=" + typeRepairs + ", modelPhoneHasRepairs=" + modelPhoneHasRepairs + "]";
	}
	
	
	
}
