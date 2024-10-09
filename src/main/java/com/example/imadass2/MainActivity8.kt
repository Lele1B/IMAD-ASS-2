package com.example.imadass2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

// Pet attributes
private var petHealth = 100
private var petHunger = 50
private var petCleanliness = 50
private var petHappiness = 50

// Constants for attributes changes
private val hungerChange = 10
private val cleanlinessChange = 10
private val healthChange = 10
private val hungerAfterPlay = 5
private val cleanlinessAfterPlay = -5
private val happinessChange = 10

fun <T> findViewById(feedBtn: Int): Any {
    TODO("Not yet implemented")
}

fun setContentView(activityMain8: Int) {
    TODO("Not yet implemented")
}

@SuppressLint("MissingInflatedId")
fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main8)
        //Declaring variables
        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val cleanBtn = findViewById<Button>(R.id.cleanBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)
        val hungryEditTxt = findViewById<EditText>(R.id.HungryEditTxt)
        val cleanEditTxt = findViewById<EditText>(R.id.CleanEditTxt)
        val happyEditTxt = findViewById<EditText>(R.id.HealthEditTxt)
        val petImage = findViewById<ImageView>(R.id.PetImage)

        //Display initial values
        hungryEditTxt.setText(petHunger.toString())
        cleanEditTxt.setText(petCleanliness.toString())
        happyEditTxt.setText(petCleanliness.toString())

        //code for what happens when the feed button is clicked
        feedBtn.setOnClickListener {
            petHunger += hungerChange
            petHealth += healthChange
            //Ensure attributes stay within bounds
            petHunger = petHunger.coerceIn(0, 100)
            petHealth = petHealth.coerceIn(0, 100)
            petCleanliness = petCleanliness.coerceIn(0, 100)
            hungryEditTxt.setText(petHunger.toString())
            cleanEditTxt.setText(petCleanliness.toString())
            animatedImageChange(petImage, R.drawable.eating)
        }
        //code for what happens when the clean button is clicked
        cleanBtn.setOnClickListener {
            petCleanliness += cleanlinessChange
            petHealth += healthChange
            //Ensure attributes stay within bounds
            petCleanliness = petCleanliness.coerceIn(0, 100)
            cleanEditTxt.setText(petCleanliness.toString())
            petHealth = petHealth.coerceIn(0, 100)
            animatdImageChange(petImage, R.drawable.bathing)

            //code for what happens when the play button is clicked
            playBtn.setOnClickListener {
                petHunger -= hungerAfterPlay
                petHunger += hungerChange
                petHealth += healthChange
                //Ensure attributes stay within bounds
                petHunger = petHunger.coerceIn(0, 100)
                petHealth = petHealth.coerceIn(0, 100)
                petCleanliness = petCleanliness.coerceIn(0, 100)
                hungryEditTxt.setText(petHunger.toString())
                cleanEditTxt.setText(petCleanliness.toString())
                AlphanimatedImageChange(petImage, R.drawable.happy)

                // function for changing the images when the buttons are clicked
                fun animatedImageChange(imageView: ImageView, newImageResource: Int) {
                    val animation = AlphaAnimation(0.0f, 1.0f)
                    animation.duration = 500
                    animation.fillAfter = true
                    imageView.startAnimation(animation)
                    imageView.setImageResource(newImageResource)
                }
                    

