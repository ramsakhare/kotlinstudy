package com.kotlinstudy.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlinstudy.R
import kotlinx.android.synthetic.main.first_activity_life_cycle.*

class FirstActivityLifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_activity_life_cycle)


        btn_click.setOnClickListener {
            intent =Intent(this@FirstActivityLifeCycle,SecondActivityLifeCycle::class.java)
            startActivity(intent)
        }

        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Create", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Start", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Stop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity On Restart", Toast.LENGTH_SHORT).show()
    }


    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this@FirstActivityLifeCycle,"First Activity on Destory", Toast.LENGTH_SHORT).show()
    }


}