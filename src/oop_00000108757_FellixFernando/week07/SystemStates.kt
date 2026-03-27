package oop_00000108757_FellixFernando.week07

enum class AppStates {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val errorMessage: String) : ApiResponse()
    object Loading : ApiResponse()
}