package com.edward.repos

import com.edward.entities.Post
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface PostService : JpaRepository<Post, Int>