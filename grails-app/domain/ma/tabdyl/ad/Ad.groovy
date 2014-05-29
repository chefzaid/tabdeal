package ma.tabdyl.ad

import ma.tabdyl.user.User

class Ad {
	
	String title
	String description
	List<String> cities
	User user
	String wishesDescription
	AdStatus status
	Date dateCreated
	Date lastUpdated
	Date closeDate
	String closeComment
	Integer viewsCount
	
	static hasMany = [
		categories:Category,
		images:byte[],
		cities:String, 
		wishesCategories:Category
	]

    static constraints = {
		title size: 2..32, blank: false
		description blank: false
		images maxSize: 4*1048576 //4MB for all of the ad's images
    }
	
	/* TODO: Image mapping !!
	 * either it'll need a grails controller to render the stream,
	 * or embed it in json ad hoc and do the treatment in js 
	 */
}
