package com.teamsparta.todolist.domain.card.model

import com.teamsparta.todolist.domain.card.dto.CardResponse
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "card")
class Card(
    @Column(name = "title")
    var title: String,

    @Column(name = "content")
    var content: String? = null,

    @Column(name = "nickname")
    var nickname: String,

    @Column(name = "cardday")
    var cardday: Date
) {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터베이스에 위임해서 id를 자동생성한다. 그래서 nullable
    var cardid: Long? = null

    fun toResponse(): CardResponse {
        return CardResponse(
            cardid = cardid!!,
            title = title,
            content = content,
            nickname = nickname,
            cardday = cardday
        )
    }

}