package com.example.exer2_resurreccion_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /*
    * Declare variables for image and text views
    * */
    private lateinit var imageView : ImageView
    private lateinit var textViewName : TextView
    private lateinit var textViewBio : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Get button view from layout and set click listener
        * */
        val randomButton: Button = findViewById(R.id.random_button)
        randomButton.setOnClickListener { randomize() }

        /*
        * Get image and text view from layout
        * */
        imageView = findViewById(R.id.disney_image)
        textViewName = findViewById(R.id.disney_name)
        textViewBio = findViewById(R.id.disney_bio_text)
    }

    /*
    * Click listener for the random button
    * */
    private fun randomize() {
        val randomInt: Int = (1..6).random()

        /*
        * Get image of randomized character from drawable
        * */
        val drawableResource = when (randomInt) {
            1 -> R.drawable.sora
            2 -> R.drawable.riku
            3 -> R.drawable.kairi
            4 -> R.drawable.roxas
            5 -> R.drawable.namine
            6 -> R.drawable.xion
            7 -> R.drawable.mickey
            8 -> R.drawable.donald
            9 -> R.drawable.goofy
            else -> R.drawable.yensid
        }

        /*
        * Get name of randomized character from values/strings
        * */
        val stringResourceName = when(randomInt) {
            1 -> R.string.name_sora
            2 -> R.string.name_riku
            3 -> R.string.name_kairi
            4 -> R.string.name_roxas
            5 -> R.string.name_namine
            6 -> R.string.name_xion
            7 -> R.string.name_mickey
            8 -> R.string.name_donald
            9 -> R.string.name_goofy
            else -> R.string.name_yensid
        }

        /*
        * Get bio of randomized character from values/strings
        * */
        val stringResourceBio = when(randomInt) {
            1 -> R.string.bio_sora
            2 -> R.string.bio_riku
            3 -> R.string.bio_kairi
            4 -> R.string.bio_roxas
            5 -> R.string.bio_namine
            6 -> R.string.bio_xion
            7 -> R.string.bio_mickey
            8 -> R.string.bio_donald
            9 -> R.string.bio_goofy
            else -> R.string.bio_yensid
        }

        /*
        * Update images and texts
        * */
        imageView.setImageResource(drawableResource)
        textViewName.setText(stringResourceName)
        textViewBio.setText(stringResourceBio)
    }
}
