package ma.tabdyl.model.enums;

enum AdStatus {
	CREATED("Créée"),
	APPROVED("Approuvée"),
	NOT_APPROVED("Non Approuvée"),
	ACTIVE("Active"),
	CLOSED("Fermée"),
	DELETED("Supprimée")
	
	String status
	
	def AdStatus(String status){
		this.status = status
	}
}
