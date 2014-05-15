package ma.tabdyl.model.enums;

enum Gender {
	MALE('Male'),
	FEMALE('Femelle')

	final String value

	Gender(String value){
		this.value = value
	}

	def String toString() {
		value
	}
	
	def String getKey() {
		name()
	}
}
