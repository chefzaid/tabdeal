package ma.tabdyl.ad

import ma.tabdyl.user.User

class Ad {
	
	String title
	String description
	List<Category> categories
	//Image mapping !! either it'll need a controller to render the stream, or embed it in json and do the treatment in js
	List<byte[]> images
	List<String> cities
	User user
	List<Category> wishesCategories
	String wishesDescription
	AdStatus status
	Date dateCreated
	Date lastUpdated
	Date closeDate
	String closeComment
	Integer viewCount
	
	static belongsTo = Category
	
	static hasMany = [
		categories:Category,
		images:byte[],
		cities:String, 
		wishesCategories:Category
	]

    static constraints = {
		title size: 2..32, blank: false
		description blank: false
		images maxSize: 4*1048576 //4MB for all images
    }
}
