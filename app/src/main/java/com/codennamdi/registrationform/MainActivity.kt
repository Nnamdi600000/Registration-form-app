package com.codennamdi.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       registrationFormIntent()
    }

    private fun registrationFormIntent() {
        button_continue.setOnClickListener {
            val registrationFormActivity = Intent(this, RegistrationForm::class.java)
            startActivity(registrationFormActivity)
        }
    }
}