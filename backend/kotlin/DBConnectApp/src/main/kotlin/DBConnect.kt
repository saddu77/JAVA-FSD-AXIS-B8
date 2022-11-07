import java.sql.DriverManager
import java.sql.Statement

//model class
data class User(val id:Int,val name: String)

fun main(args: Array<String>) {
    val jdbcUrl = "jdbc:mysql://localhost:3306/sampledb"
    val connection = DriverManager.getConnection(jdbcUrl,"root","admin")
    //println(connection.isValid(0))

//    //insert query -Create
//    val res = connection.createStatement().executeUpdate("insert into users(name) values('Anil')")
//        if(res > 0){
//            println("successfully inserted record into users db !!!")
//        } else{
//            println("Insert Not sucessful")
//        }
//    // update query - Update
//    val update_res = connection.createStatement().executeUpdate("update users set name = 'Rahul' where id = 10")
//    if( update_res > 0){
//        println("successfully updated record in users db !!!")
//    } else{
//        println("Update Not sucessful")
//    }

    //delete query
    val delete_res = connection.createStatement().executeUpdate("delete from users where id = 11")
    if( delete_res > 0){
        println("successfully deleted record in users db !!!")
    } else{
        println("Delete Not sucessful")
    }



    //select query - Read
    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    println(users)
}