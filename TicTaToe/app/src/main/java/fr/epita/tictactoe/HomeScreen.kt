package fr.epita.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val explicitIntent = Intent(this, Game::class.java)

        start.setOnClickListener {
            Log.d("HomeScreen", name.text.toString())
            explicitIntent.putExtra("NAME", name.text.toString() )
            this.startActivity(explicitIntent)
        }
    }




}

