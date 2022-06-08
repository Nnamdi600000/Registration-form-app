package com.codennamdi.registrationform

import java.io.Serializable

data class FormDetails(
    val firstName: String,
    val lastName: String,
    val eMail: String,
    val phoneNumber: String,
    val passWord: String,
    val title:String
): Serializable{
    fun getFormName() = "$title $firstName $lastName"
}