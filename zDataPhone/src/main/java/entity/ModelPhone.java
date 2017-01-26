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
@Table(name="modelPhone")
public class ModelPhone {

	@Id
	@Column(name = "id_Model_Phone")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idModelPhone;
	
	@Column(name = "name_of_phone")
	private String nameModelPhone;
	
	@Column(name = "description_phone")
	private String descriptionPhone;
	

	@OneToMany(mappedBy="modelPhone")
	private List<ModelPhoneHasRepairs> modelPhoneHasRepairs;
	

	@OneToMany(mappedBy="modelPhone")
	private List<CharacteristicsDescripshin> characteristicsDescripshin;
	
	
	

	public ModelPhone() {
		super();
	}




	public ModelPhone(String nameModelPhone, String descriptionPhone, List<ModelPhoneHasRepairs> modelPhoneHasRepairs,
			List<CharacteristicsDescripshin> characteristicsDescripshin) {
		super();
		this.nameModelPhone = nameModelPhone;
		this.descriptionPhone = descriptionPhone;
		this.modelPhoneHasRepairs = modelPhoneHasRepairs;
		this.characteristicsDescripshin = characteristicsDescripshin;
	}




	public int getIdModelPhone() {
		return idModelPhone;
	}




	public void setIdModelPhone(int idModelPhone) {
		this.idModelPhone = idModelPhone;
	}




	public String getNameModelPhone() {
		return nameModelPhone;
	}




	public void setNameModelPhone(String nameModelPhone) {
		this.nameModelPhone = nameModelPhone;
	}




	public String getDescriptionPhone() {
		return descriptionPhone;
	}




	public void setDescriptionPhone(String descriptionPhone) {
		this.descriptionPhone = descriptionPhone;
	}




	public List<ModelPhoneHasRepairs> getModelPhoneHasRepairs() {
		return modelPhoneHasRepairs;
	}




	public void setModelPhoneHasRepairs(List<ModelPhoneHasRepairs> modelPhoneHasRepairs) {
		this.modelPhoneHasRepairs = modelPhoneHasRepairs;
	}




	public List<CharacteristicsDescripshin> getCharacteristicsDescripshin() {
		return characteristicsDescripshin;
	}




	public void setCharacteristicsDescripshin(List<CharacteristicsDescripshin> characteristicsDescripshin) {
		this.characteristicsDescripshin = characteristicsDescripshin;
	}




	@Override
	public String toString() {
		return "ModelPhone [idModelPhone=" + idModelPhone + ", nameModelPhone=" + nameModelPhone + ", descriptionPhone="
				+ descriptionPhone + ", modelPhoneHasRepairs=" + modelPhoneHasRepairs + ", characteristicsDescripshin="
				+ characteristicsDescripshin + "]";
	}



	
	
	
	
	
	
	

	
	
	
}
