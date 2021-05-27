package com.example.hw2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start.setOnClickListener{
            val intent= Intent(this,Tic_Tac_Toe::class.java)
            startActivity(intent)
        }


        /*val builder=AlertDialog.Builder(this)
        builder.setTitle("Are you sure!")
        builder.setMessage("Do you want to close the app?")
        builder.setPositiveButton("Yes", {dialog: DialogInterface?, i: Int ->
            finish()
        } )
       builder.setNegativeButton("No",{dialog: DialogInterface?, i: Int ->})
        builder.show()*/
    }
    fun Quit(view: View){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Are you sure!")
        builder.setMessage("Do you want to close the app?")
        builder.setPositiveButton("Yes", {dialog: DialogInterface?, i: Int ->
            finish()
        } )
        builder.setNegativeButton("No",{dialog: DialogInterface?, i: Int ->})
        builder.show()
    }
}