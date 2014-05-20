package ma.tabdyl.user;

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
	
	def String getId() {
		toString()
	}
}
