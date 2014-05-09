package ma.tabdyl.model.enums;

enum Gender {
	MALE('Male'),
	FEMALE('Femelle')
	
	String status
	
	def AdStatus(String status){
		this.status = status
	}
}
