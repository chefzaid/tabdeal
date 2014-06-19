package ma.tabdyl.ad

class Picture {
	
	byte[] fileData

    static constraints = {
		fileData maxSize: 1*1048576 //1MB Max per picture
    }
}
