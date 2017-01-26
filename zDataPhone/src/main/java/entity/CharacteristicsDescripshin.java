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
@Table(name="characteristicsDescripshin")
public class CharacteristicsDescripshin {

	@Id
	@Column(name = "id_characteristics_descripshin")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCharacteristicsDescripshin;
	
	@Column(name = "chdescription")
	private String chdescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Model_Phone")
	private ModelPhone modelPhone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Model_Phone")
	private Characteristic characteristic;

	public CharacteristicsDescripshin() {
		super();
	}
	
	
	
	public CharacteristicsDescripshin(Characteristic characteristic) {
		super();
		this.characteristic = characteristic;
	}



	

	public CharacteristicsDescripshin(String chdescription, ModelPhone modelPhone, Characteristic characteristic) {
		super();
		this.chdescription = chdescription;
		this.modelPhone = modelPhone;
		this.characteristic = characteristic;
	}



	public void setIdCharacteristicsDescripshin(int idCharacteristicsDescripshin) {
		this.idCharacteristicsDescripshin = idCharacteristicsDescripshin;
	}

	public String getChdescription() {
		return chdescription;
	}

	public void setChdescription(String chdescription) {
		this.chdescription = chdescription;
	}

	public ModelPhone getModelPhone() {
		return modelPhone;
	}

	public void setModelPhone(ModelPhone modelPhone) {
		this.modelPhone = modelPhone;
	}

	public Characteristic getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(Characteristic characteristic) {
		this.characteristic = characteristic;
	}

	@Override
	public String toString() {
		return "CharacteristicsDescripshin [idCharacteristicsDescripshin=" + idCharacteristicsDescripshin
				+ ", chdescription=" + chdescription + ", modelPhone=" + modelPhone + ", characteristic="
				+ characteristic + "]";
	}
	
	
	
}
