import com.mongodb.BasicDBObject
import com.mongodb.MongoClient
import com.mongodb.MongoException

fun main(args: Array<String>) {
    var mongoClient: MongoClient? = null
    try {
        mongoClient = MongoClient("127.0.0.1", 27017)
        var db = mongoClient.getDB("testDB")
        var tbl = db.getCollection("user")
        val document = BasicDBObject()
        document.put("name","John")
        document.put("lastname","Doe")
        tbl.insert(document)
    } catch (e: MongoException) {
        e.printStackTrace()
    } finally {
        mongoClient!!.close()
    }
}

//data class User(val name: String, val lastname: String)
