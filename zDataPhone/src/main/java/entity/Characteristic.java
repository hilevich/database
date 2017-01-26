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
@Table(name="characteristic")
public class Characteristic {

	@Id
	@Column(name = "id_characteristic")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCharacteristic;
	
	@Column(name = "name_characteristic")
	private String nameCharacteristic;
	
	@OneToMany(mappedBy="characteristic")
	private List<CharacteristicsDescripshin> characteristicsDescripshin;

	public Characteristic() {
		super();
	}

	public Characteristic(String nameCharacteristic, List<CharacteristicsDescripshin> characteristicsDescripshin) {
		super();
		this.nameCharacteristic = nameCharacteristic;
		this.characteristicsDescripshin = characteristicsDescripshin;
	}

	public int getIdCharacteristic() {
		return idCharacteristic;
	}

	public void setIdCharacteristic(int idCharacteristic) {
		this.idCharacteristic = idCharacteristic;
	}

	public String getNameCharacteristic() {
		return nameCharacteristic;
	}

	public void setNameCharacteristic(String nameCharacteristic) {
		this.nameCharacteristic = nameCharacteristic;
	}

	public List<CharacteristicsDescripshin> getCharacteristicsDescripshin() {
		return characteristicsDescripshin;
	}

	public void setCharacteristicsDescripshin(List<CharacteristicsDescripshin> characteristicsDescripshin) {
		this.characteristicsDescripshin = characteristicsDescripshin;
	}

	@Override
	public String toString() {
		return "Characteristic [idCharacteristic=" + idCharacteristic + ", nameCharacteristic=" + nameCharacteristic
				+ ", characteristicsDescripshin=" + characteristicsDescripshin + "]";
	}
	
	
	
}
