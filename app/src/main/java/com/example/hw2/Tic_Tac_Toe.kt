package com.example.hw2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.hw2.R.*
import kotlinx.android.synthetic.main.activity_tic__tac__toe.*

class Tic_Tac_Toe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_tic__tac__toe)
        val actionBar=supportActionBar
        actionBar!!.title="Tic Tac Toe"
    }
    fun buClick(view : View){
        var selectedButton:Button=view as Button
        var cellID=0
        when(selectedButton){
            b0->cellID=0
            b1->cellID=1
            b2->cellID=2
            b3->cellID=3
            b4->cellID=4
            b5->cellID=5
            b6->cellID=6
            b7->cellID=7
            b8->cellID=8

        }
        playGame(cellID,selectedButton)
    }
    var activePlayer=1
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    fun playGame(cellID:Int,selectedButton:Button){
    if(activePlayer==1){
        selectedButton.setBackgroundColor(0xFFFF0000.toInt())
        selectedButton.text="X"
        activePlayer=2
        player1.add(cellID)
    }else{
        selectedButton.setBackgroundColor(Color.WHITE)
        selectedButton.text="O"
        activePlayer=1
        player2.add(cellID)
    }
        selectedButton.isEnabled=false
    }
}