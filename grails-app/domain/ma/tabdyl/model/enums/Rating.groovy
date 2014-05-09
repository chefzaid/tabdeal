package ma.tabdyl.model.enums;

enum Rating {
	STARS_1_5('1 / 5'),
	STARS_2_5('2 / 5'),
	STARS_3_5('3 / 5'),
	STARS_4_5('4 / 5'),
	STARS_5_5('5 / 5')
	
	String status
	
	def AdStatus(String status){
		this.status = status
	}
}