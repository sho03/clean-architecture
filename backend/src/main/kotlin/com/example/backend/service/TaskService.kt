package com.example.backend.service

import com.example.backend.domain.Task
import com.example.backend.infrastracture.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: TaskRepository,
) {
    fun registerTask(taskName: String, taskDescription: String): Task {
        val task = Task.createTask(taskName, taskDescription)
        return task
    }

    fun getTasks(): List<Task> {
        // TODO
        return listOf(
            Task.createTask("task1", "description1"),
            Task.createTask("task2", "description2"),
            Task.createTask("task3", "description3"),
        )
    }
}
