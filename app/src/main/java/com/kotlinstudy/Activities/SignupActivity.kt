package com.kotlinstudy.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //To get refrences to all views
      var et_name=findViewById<EditText>(R.id.et_name)
      var et_contact_no=findViewById<EditText>(R.id.et_contact_no)
      var et_email_id=findViewById<EditText>(R.id.et_email_id)
      var et_username=findViewById<EditText>(R.id.et_username)
      var et_password=findViewById<EditText>(R.id.et_password)

       btn_signup.setOnClickListener {

           val str_name=et_name.text.toString()
           val str_contact_no=et_contact_no.text.toString()
           val str_email_id=et_email_id.text.toString()
           val str_username=et_username.text.toString()
           val str_password=et_password.text.toString()

          Toast.makeText(this@SignupActivity,str_name+"-"+str_contact_no+"--"+str_email_id+"---"+str_username+"----"+str_password,Toast.LENGTH_LONG).show()

       }


        btn_login.setOnClickListener {

            intent=Intent(applicationContext,ExplicitIntentActivityFirst::class.java)
            startActivity(intent)

            Toast.makeText(this@SignupActivity,"Login Button",Toast.LENGTH_SHORT).show()
        }


    }


}