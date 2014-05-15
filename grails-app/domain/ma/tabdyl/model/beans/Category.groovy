package ma.tabdyl.model.beans

class Category {
	
	String title
	String description
	Category parent

    static constraints = {
		title size: 2..32, blank: false
		parent unique : true
    }
}
