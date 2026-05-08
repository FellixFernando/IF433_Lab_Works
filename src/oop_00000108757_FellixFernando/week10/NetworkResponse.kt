package oop_00000108757_FellixFernando.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)