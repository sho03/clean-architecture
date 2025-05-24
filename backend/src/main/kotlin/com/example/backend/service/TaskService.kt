package com.example.backend.service

import com.example.backend.domain.Task
import com.example.backend.domain.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: TaskRepository,
) {
    fun registerTask(taskName: String, taskDescription: String): Task {
        val task = Task.createTask(taskName, taskDescription)
        taskRepository.registerTask(task)
        return task
    }

    fun getTasks(): List<Task> {
        return taskRepository.getTasks()
    }
}
