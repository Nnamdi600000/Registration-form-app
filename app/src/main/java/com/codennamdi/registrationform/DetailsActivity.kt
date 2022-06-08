package com.codennamdi.registrationform

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var formDetails: FormDetails

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        retrieveDetains()
        displayDetains()
        setUpClickListeners()
    }

    private fun retrieveDetains() {
        formDetails = intent.getSerializableExtra("FormDetails") as FormDetails
    }

    private fun displayDetains() {
        text_view_user_name.text = formDetails.getFormName()
        text_view_email.text = formDetails.eMail
        text_view_phone_number.text = formDetails.phoneNumber
    }

    private fun setUpClickListeners() {
        text_view_email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data =
                    Uri.parse("mailto: ${formDetails.eMail}") // only email apps should handle this
            }
            startActivity(intent)
        }

        text_view_phone_number.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel: ${formDetails.phoneNumber}")
            }
            startActivity(intent)
        }
    }
}