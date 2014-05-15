package ma.tabdyl.model.enums;

enum AdStatus {
	CREATED("Créée"),
	APPROVED("Approuvée"),
	NOT_APPROVED("Non Approuvée"),
	ACTIVE("Active"),
	NOT_ACTIVE("Non active"),
	CLOSED("Fermée"),
	DELETED("Supprimée")

	final String value

	AdStatus(String value){
		this.value = value
	}

	def String toString() {
		value
	}
	
	def String getKey() {
		name()
	}
}
