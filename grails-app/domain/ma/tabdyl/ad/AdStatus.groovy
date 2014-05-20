package ma.tabdyl.ad;

enum AdStatus {
	CREATED("Cr��e"),
	APPROVED("Approuv�e"),
	NOT_APPROVED("Non Approuv�e"),
	ACTIVE("Active"),
	NOT_ACTIVE("Non active"),
	CLOSED("Ferm�e"),
	DELETED("Supprim�e")

	final String value

	AdStatus(String value){
		this.value = value
	}

	def String toString() {
		value
	}
	
	def String getId() {
		toString()
	}
}
