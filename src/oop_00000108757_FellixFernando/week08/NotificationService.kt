package oop_00000108757_FellixFernando.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke $emailAddress")
    }

    fun pricessUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email!")
        }
    }
}