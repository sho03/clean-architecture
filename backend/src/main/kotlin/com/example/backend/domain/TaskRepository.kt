package com.example.backend.domain

interface TaskRepository {
    fun registerTask(task: Task)
    fun getTasks(): List<Task>
}