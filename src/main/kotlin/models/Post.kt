package com.edward.entities
import java.util.*
import javax.persistence.*
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "posts")
data class Post(
    @Id @GeneratedValue val id: Int = 0,
    val parent_id: Int?,
    val author: String = "Anonymous",
    val body: String = "",
    @Temporal(TemporalType.TIMESTAMP)
    @Generated(GenerationTime.ALWAYS)
    @Column(name="created_at", insertable=false,updatable=false)
    val created_at: Calendar?
)