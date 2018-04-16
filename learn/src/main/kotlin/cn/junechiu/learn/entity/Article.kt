package cn.junechiu.learn.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 * Created by android on 2018/3/31.
 */

@Entity
data class Article(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = -1,
        @Version
        var version: Long = 0,
        var title: String = "",
        var content: String = "",
        var author: String = "",
        var gmtCreated: Date = Date(),
        var gmtModified: Date = Date(),
        var isDeleted: Int = 0, //1 Yes 0 No
        var deletedDate: Date = Date()
) : Serializable