package ma.tabdyl.model.enums;

enum AccountType {
	PERSONAL('Particulier'),
	PROFESSIONAL('Professionnel'),

	String status
	
	def AdStatus(String status){
		this.status = status
	}
}
