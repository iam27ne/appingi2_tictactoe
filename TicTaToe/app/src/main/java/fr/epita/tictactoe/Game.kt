package fr.epita.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*




class Game : AppCompatActivity(), View.OnClickListener {

    var turn = false
    var grid = Array(9, { _ -> 0 })
    var player_name = ""
    var turn_cc = 0

    override fun onCreate(savedInstanceState: Bundle?) {

    }




    override fun onClick(clickedView: View?) {

    }

}


