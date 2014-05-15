package ma.tabdyl.model.enums;

enum AccountType {
	PERSONAL('Particulier'),
	PROFESSIONAL('Professionnel'),

	final String value

	AccountType(String value){
		this.value = value
	}

	def String toString() {
		value
	}

	def String getKey() {
		name()
	}
}
