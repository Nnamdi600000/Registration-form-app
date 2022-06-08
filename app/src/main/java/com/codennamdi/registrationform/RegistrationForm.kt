package com.codennamdi.registrationform

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration_form.*

class RegistrationForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)

        val spinnerTitleValues: Array<String> =
            arrayOf("Developer", "Mr", "Mrs", "Miss", "Dr", "Prof", "Student")
        val spinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerTitleValues)
        spinner_title.adapter = spinnerAdapter

        button_register.setOnClickListener {
            onRegisterClicked()
        }
    }

    private fun onRegisterClicked() {
        val formDetailsClass = FormDetails(
            edit_text_first_name.text.toString(),
            edit_text_last_name.text.toString(),
            edit_text_email.text.toString(),
            edit_text_phone_number.text.toString(),
            edit_text_password.text.toString(),
            spinner_title.selectedItem as String
        )

        val registrationFormOnClickedIntent = Intent(this, DetailsActivity::class.java)
        registrationFormOnClickedIntent.putExtra("FormDetails", formDetailsClass)
        startActivity(registrationFormOnClickedIntent)
    }
}