/**
 * 
 */
package ma.tabdyl.user


class Account extends User { 

	String login
	String password
	Gender gender
	AccountType type
	Boolean receiveMessages
	Boolean receiveNews
	Date birthDate
	String occupation
	List<String> wishList
	Date dateCreated
	Rating rating
	Boolean isDeleted
	
	static hasMany = [wishList:String]
	
	static constraints = {
		login size: 6..16, blank: false, unique: true
		password size: 6..16, blank: false
	}
}
