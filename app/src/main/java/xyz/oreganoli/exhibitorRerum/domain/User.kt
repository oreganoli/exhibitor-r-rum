package xyz.oreganoli.exhibitorRerum.domain

data class User (
    var id: Int = 0,
    var name: String = "",
    var username: String = "",
    var email: String = "",
    var address: Address,
    var phone: String = "",
    var webiste: String = "",
    var company: Company
)