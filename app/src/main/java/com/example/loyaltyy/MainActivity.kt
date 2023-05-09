package com.example.loyaltyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mTvMain:TextView
    lateinit var mTvNewUser:TextView
    lateinit var mBtnNewUser:Button
    lateinit var mTvLogin:TextView
    lateinit var mBtnLoginMain:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTvMain = findViewById(R.id.mTvMain)
        mTvNewUser = findViewById(R.id.mTvNewUser)
        mBtnNewUser = findViewById(R.id.mBtnNewUser)
        mTvLogin = findViewById(R.id.mTvLoginView)
        mBtnLoginMain = findViewById(R.id.mBtnLoginMain)
        // set onclick listeners to buttons
        mBtnNewUser.setOnClickListener {
            val Register = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(Register)
            
        }
        mBtnLoginMain.setOnClickListener {
            val Login = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(Login)
        }
    }
}