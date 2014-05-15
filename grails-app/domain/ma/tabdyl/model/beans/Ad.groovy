package ma.tabdyl.model.beans

import ma.tabdyl.model.enums.AdStatus;

class Ad {
	
	String title
	String description
	//many to many
	List<Category> categories
	//Collection
	List<File> images
	//Collection
	List<String> cities
	User user
	//Collection
	List<Category> desiredCategories
	String desiredItems
	AdStatus status
	Date dateCreated
	Date lastUpdated
	Date closeDate
	String closeComment
	Integer viewCount

    static constraints = {
		title size: 2..32, blank: false
		description blank: false
    }
}
