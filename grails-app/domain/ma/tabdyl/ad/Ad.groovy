package ma.tabdyl.ad

import ma.tabdyl.user.User

class Ad {
	
	String title
	String description
	User user
	List<String> cities
	List<Picture> pictures
	String wishList
	AdStatus status
	Date dateCreated
	Date lastUpdated
	Date closeDate
	String closeComment
	Integer viewsCount
	
	static belongsTo = Category
	
	static hasMany = [
		categories:Category,
		pictures:Picture,
		cities:String
	]

    static constraints = {
		title size: 2..32, blank: false
		description blank: false
    }
	
	/* TODO: Image mapping !!
	 * either it'll need a Grails controller to render the stream,
	 * or embed it in JSON ad hoc and do the treatment in a JS controller 
	 */
}
