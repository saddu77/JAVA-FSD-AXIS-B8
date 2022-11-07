import java.sql.DriverManager

// the model class
data class User(val id: Int, val name: String)

fun main(){

    val jdbcUrl = "jdbc:mysql://localhost:3306/sampleDB"

    // get the connection
    val connection = DriverManager
        .getConnection(jdbcUrl, "root", "admin")

    // prints true if the connection is valid
    println(connection.isValid(0))

    // the query is only prepared not executed
    val query = connection.prepareStatement("SELECT * FROM users")

    // the query is executed and results are fetched
    val result = query.executeQuery()

    // an empty list for holding the results
    val users = mutableListOf<User>()

    while(result.next()){

        // getting the value of the id column
        val id = result.getInt("id")

        // getting the value of the name column
        val name = result.getString("name")

        /*
        constructing a User object and
        putting data into the list
         */
        users.add(User(id, name))
    }

    println(users)
}