package com.kotlinstudy.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_explicit_intent_first.*

class ExplicitIntentActivityFirst : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_first)

        var et_username=findViewById<EditText>(R.id.et_username)
        var et_password=findViewById<EditText>(R.id.et_password)


        btn_login.setOnClickListener {

            val str_username=et_username.text.toString()
            val str_password=et_password.text.toString()

            Toast.makeText(this@ExplicitIntentActivityFirst,str_username+"=="+str_password,Toast.LENGTH_SHORT).show()

            intent=Intent (this@ExplicitIntentActivityFirst,ExplicitIntentSecondActivity::class.java)
            intent.putExtra("username",str_username)
            intent.putExtra("password",str_password)
            startActivity(intent)
        }

        btn_signup.setOnClickListener {

            intent=Intent(this@ExplicitIntentActivityFirst,SignupActivity::class.java)
            startActivity(intent)

        }



    }






}