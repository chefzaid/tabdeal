package ma.tabdyl.model.enums;

enum AdStatus {
	CREATED("Cr��e"),
	APPROVED("Approuv�e"),
	NOT_APPROVED("Non Approuv�e"),
	ACTIVE("Active"),
	CLOSED("Ferm�e"),
	DELETED("Supprim�e")
	
	String status
	
	def AdStatus(String status){
		this.status = status
	}
}
