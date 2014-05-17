package ma.tabdyl.ad

import ma.tabdyl.model.enums.AdStatus;
import ma.tabdyl.user.User

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
