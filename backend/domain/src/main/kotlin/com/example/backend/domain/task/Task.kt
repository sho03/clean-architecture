package com.example.backend.domain.task

import java.util.UUID

class Task(
    val id: UUID,
    val title: String,
    val description: String,
) {
    companion object {
        fun createTask(taskName: String, taskDescription: String): Task {
            return Task(
                id = UUID.randomUUID(),
                title = taskName,
                description = taskDescription
            )
        }
    }
}
