package ma.tabdyl.ad

class Category {
	
	String title
	String description
	Category parent
	
	static hasMany = [ads:Ad]
	
	static belongsTo = Ad

    static constraints = {
		title size: 2..32, blank: false
		parent unique : true
    }
}