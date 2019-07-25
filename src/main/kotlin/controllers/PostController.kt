package com.edward.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import com.edward.entities.Post
import com.edward.repos.PostService
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid

@RestController
class PostController {
    @Autowired
    private lateinit var postService: PostService

    @GetMapping("/")
    fun posts(): List<Post> =
        postService.findAll()

    @GetMapping("/{id}")
    fun post(@PathVariable() id: Int): Post =
        postService.getOne(id)

    @PostMapping("/")
    fun post(@Valid @RequestBody post: Post): Post =
        postService.save(post)
}