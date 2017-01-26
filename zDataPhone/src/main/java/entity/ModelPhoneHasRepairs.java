package entity;






import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="modelPhoneHasRepairs")
public class ModelPhoneHasRepairs {

	@Id
	@Column(name = "id_Model_Phone_Has_Repairs")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idModelPhoneHasRepairs;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "type_of_price")
	private String typeOfPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Model_Phone")
	private ModelPhone modelPhone;

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Repairs")
	private Repairs repairs;
	
	
	public ModelPhoneHasRepairs() {
		super();
	}


	public int getIdModelPhoneHasRepairs() {
		return idModelPhoneHasRepairs;
	}


	public void setIdModelPhoneHasRepairs(int idModelPhoneHasRepairs) {
		this.idModelPhoneHasRepairs = idModelPhoneHasRepairs;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getTypeOfPrice() {
		return typeOfPrice;
	}


	public void setTypeOfPrice(String typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
	}


	public ModelPhone getModelPhone() {
		return modelPhone;
	}


	public void setModelPhone(ModelPhone modelPhone) {
		this.modelPhone = modelPhone;
	}


	public Repairs getRepair() {
		return repairs;
	}


	public void setRepair(Repairs repairs) {
		this.repairs = repairs;
	}


	@Override
	public String toString() {
		return "ModelPhoneHasRepairs [idModelPhoneHasRepairs=" + idModelPhoneHasRepairs + ", price=" + price
				+ ", typeOfPrice=" + typeOfPrice + ", modelPhone=" + modelPhone + ", repair=" + repairs + "]";
	}







	
		
	
}
