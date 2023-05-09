package com.example.loyaltyy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var edtFirstName:EditText
    lateinit var edtSecondName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtPassword:EditText
    lateinit var btnReg:Button
    lateinit var tvRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtFirstName= findViewById(R.id.mEdtFirstName)
        edtSecondName = findViewById(R.id.mEdtSecondName)
        edtEmail = findViewById(R.id.mEdtEmailReg)
        edtPassword = findViewById(R.id.mEdtPassword)
        btnReg = findViewById(R.id.mBtnReg)
        tvRegister = findViewById(R.id.mTvRegister)
    }
}