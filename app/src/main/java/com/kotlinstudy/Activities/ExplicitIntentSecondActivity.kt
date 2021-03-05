package com.kotlinstudy.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.kotlinstudy.R

class ExplicitIntentSecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_second)

        var tv_username=findViewById<TextView>(R.id.tv_username)
        var tv_password=findViewById<TextView>(R.id.tv_password)

        val bundle:Bundle?=intent.extras
        val str_username:String?=bundle?.getString("username")
        val str_password:String?=bundle?.getString("password")

        Toast.makeText(this@ExplicitIntentSecondActivity,"DATA--"+str_username+"==="+str_password,Toast.LENGTH_LONG).show()

        tv_username.setText(str_username)
        tv_password.setText(str_password)




    }
}