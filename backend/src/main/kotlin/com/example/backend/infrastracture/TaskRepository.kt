package com.example.backend.infrastracture

import com.example.backend.domain.Task
import com.example.backend.domain.TaskRepository
import org.springframework.stereotype.Repository

@Repository
class TaskRepositoryImpl : TaskRepository {

    // FIXME: In-memory storage for tasks
    private val tasks = mutableListOf<Task>()

    override fun registerTask(task: Task) {
        tasks.add(task)
    }

    override fun getTasks(): List<Task> {
        return tasks
    }
}