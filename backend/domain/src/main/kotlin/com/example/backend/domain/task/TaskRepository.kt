package com.example.backend.domain.task

interface TaskRepository {
    fun registerTask(task: Task)
    fun getTasks(): List<Task>
}