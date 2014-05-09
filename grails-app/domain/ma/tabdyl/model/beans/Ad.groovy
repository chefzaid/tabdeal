package ma.tabdyl.model.beans

import ma.tabdyl.model.enums.AdStatus;

class Ad {
	
	String title
	String description
	List<Category> categories
	List<File> images
	List<String> cities
	User user
	List<Category> desiredCategories
	String desiredItems
	AdStatus status
	Date dateCreated
	Date lastUpdated
	Date closeDate
	String closeComment
	Integer viewCount

    static constraints = {
    }
}
