package example.com.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MessageResponse (
    val message : String
)
