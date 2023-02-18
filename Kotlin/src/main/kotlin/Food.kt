import java.util.Scanner

class Food {
    /* Store a list of restaurants organizing them by if they are quick or sit down.
    * Also store a list of all options organizing by type of food. */

    // Lists of quick restaurants
    val americanQuick = arrayOf("5 Guys", "Mcdonald's", "Wendy's", "Carl's Jr.")
    val mexicanQuick = arrayOf("Taco Bell", "Jalisco's", "Cafe Rio", "Costa Vida")
    val asianQuick = arrayOf("Cupbop", "Panda Express")
    val otherQuick = arrayOf("Wing Stop")
    val allRestaurantsQuick = arrayOf("5 Guys", "Mcdonald's", "Wendy's", "Carl's Jr.",
        "Taco Bell", "Jalisco's", "Cafe Rio", "Costa Vida", "Cupbop", "Panda Express",
        "Wing Stop")

    // Lists of sit down restaurants
    val americanSitDown = arrayOf("Applebee's", "Red Robin", "Texas Roadhouse")
    val mexicanSitDown = arrayOf("Garcia's")
    val asianSitDown = arrayOf("Fuji Sushi", "Blue Hashi", "Hokkaido ramen")
    val otherSitDown = arrayOf("Tandori Oven", "Olive Garden", "Smokin Fins")
    val allRestaurantsSitDown = arrayOf("Applebee's", "Red Robin", "Texas Roadhouse", "Fuji Sushi",
        "Blue Hashi", "Hokkaido ramen", "Tandori Oven", "Olive Garden", "Smokin Fins",
        "Garcia's")

    // lists of all restaurants
    val american = arrayOf("5 Guys", "Applebee's", "Red Robin", "Texas Roadhouse",
        "Wendy's", "Carl's Jr.")
    val mexican = arrayOf("Taco Bell", "Jalisco's", "Cafe Rio", "Costa Vida", "Garcia's")
    val asian = arrayOf("Fuji Sushi", "Blue Hashi", "Cupbop", "Hokkaido ramen", "Main Moon", "Panda Express")
    val other = arrayOf("Tandori Oven", "Olive Garden", "Smokin Fins", "Wing Stop")
    val allRestaurants = arrayOf("5 Guys", "Mcdonald's", "Applebee's", "Red Robin", "Texas Roadhouse",
        "Wendy's", "Carl's Jr.", "Taco Bell", "Jalisco's", "Cafe Rio", "Costa Vida", "Fuji Sushi",
        "Blue Hashi", "Cupbop", "Hokkaido ramen", "Main Moon", "Panda Express", "Tandori Oven",
        "Olive Garden", "Smokin Fins", "Wing Stop", "Garcia's")

}

fun userChoice(restaurantType:Int, foodType:Int, typeInt:Int, moodInt:Int, restaurant:String) {

    // Determine what type of restaurants the user wants to eat at
    if (restaurantType == typeInt) {
        // Determine what type of food the user is in the mood to eat
        if (foodType == moodInt) {
            // Display Results
            println("You will be eating at '$restaurant', Enjoy!")
        }
    }
}


fun main() {
    // Call the food class and set as a declarable object
    val food = Food()
    // Call the scanner function to allow for user input
    val reader = Scanner(System.`in`)
    var satisfied:String
    satisfied = "n"

    /* While the user us not satisfied with the results of the random restaurant
    * Allow them to pick again. */
    while (satisfied == "n") {
        // Display options on the terminal
        println("Input number 1-3 for what type of restaurant you would like to eat at:")
        println("1: Quick Restaurant")
        println("2: Sit Down Restaurant")
        println("3: Any Restaurants")
        // Get user input on what type of restaurant they want to eat at
        val restaurantType:Int = reader.nextInt()

        // Display options on the terminal
        println("Input 0-4 for what type of food you are in the mood for:")
        println("0: I Don't Know")
        println("1: American")
        println("2: Mexican")
        println("3: Asian")
        println("4: Other")
        // Get user input on what food they are in the mood to eat
        val foodType:Int = reader.nextInt()

        // Call the userChoice function to determine what kind or restaurant and food the user wants
        userChoice(restaurantType, foodType, 1, 0, food.allRestaurantsQuick.random())
        userChoice(restaurantType, foodType, 1, 1, food.americanQuick.random())
        userChoice(restaurantType, foodType, 1, 2, food.mexicanQuick.random())
        userChoice(restaurantType, foodType, 1, 3, food.asianQuick.random())
        userChoice(restaurantType, foodType, 1, 4, food.otherQuick.random())
        userChoice(restaurantType, foodType, 2, 0, food.allRestaurantsSitDown.random())
        userChoice(restaurantType, foodType, 2, 1, food.americanSitDown.random())
        userChoice(restaurantType, foodType, 2, 2, food.mexicanSitDown.random())
        userChoice(restaurantType, foodType, 2, 3, food.asianSitDown.random())
        userChoice(restaurantType, foodType, 2, 4, food.otherSitDown.random())
        userChoice(restaurantType, foodType, 3, 0, food.allRestaurants.random())
        userChoice(restaurantType, foodType, 3, 1, food.american.random())
        userChoice(restaurantType, foodType, 3, 2, food.mexican.random())
        userChoice(restaurantType, foodType, 3, 3, food.asian.random())
        userChoice(restaurantType, foodType, 3, 4, food.other.random())

        // Give the user an opportunity to say they are satisfied with the results of the restaurant
        println("Are you satisfied with your results? (y/n)")
        satisfied = reader.next()
        // If the user is satisfied end the loop
        if (satisfied == "y") {
            break
        }
    }
    // Thank the user for using the program
    println("Thank you for choosing where to eat with us!")
}