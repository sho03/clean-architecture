package com.example.backend.controller.com.example.backend.controller

import com.example.backend.domain.task.Task
import com.example.backend.service.com.example.backend.service.TaskService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tasks")
class TaskController(
    private val taskService: TaskService,
) {

    @PostMapping
    fun registerTask(
        @RequestBody request: RegisterTaskRequest,
    ): ResponseEntity<Task> {
        val task = taskService.registerTask(request.taskName, request.taskDescription)
        return ResponseEntity.ok(task)
    }

    data class RegisterTaskRequest(
        val taskName: String,
        val taskDescription: String,
    )

    @GetMapping
    fun getTasks(): ResponseEntity<List<Task>> {
        val tasks = taskService.getTasks()
        return ResponseEntity.ok(tasks)
    }
}