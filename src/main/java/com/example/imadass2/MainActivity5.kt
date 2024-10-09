package com.example.imadass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity5 : AppCompatActivity()
package com.example.imadass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity4 : AppCompatActivity()

}package com.example.imadass2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    // Pet attributes
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    // Constants for attributes changes
    private val hungerChange = 10
    private val cleanlinessChange = 10
    private val healthChange = 10
    private val hungerAfterPlay = 5
    private val cleanlinessAfterPlay = -5
    private val happinessChange = 10


    @SuppressLint("MissingInflated", "MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?){
        supersuper.OnCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Declaring variables
        val feedBtn = findViewById<Button>(R.id.feed_Btn)
        val cleanBtn = findViewById<Button>(R.id.clean_Btn)
        val platBtn = findViewById<Button>(R.id.play_Btn)
        val hungryEditTxt = findViewById<EditText>(R.id.humgry_Edit_Txt)
        val cleanEditTxt = findViewById<EditText>(R.id.clean_Edit_Txt)
        val happyEditTxt = findViewById<EditText>(R.id.happ-Edit_Txt)
        val petImage = findViewById<ImageView>(R.id.pet_image)

        //Display initial values
        hungryEditTxt.setText(petHunger.toString())
        cleanEditTxt.setText(petCleanliness.toString())
        happyEditTxt.setText(petCleanliness.toString())

        // function for changing the images when the buttons are clicked
        private fun animatedImageChange(imageView: ImageView, newImageResource: Int) {
            val animation = AlphaAnimation(0,of, 1,of)
            animation.duration = 500
            animation.fillAfter = true
            imageView.startAnimation(animation)
            imageView.setImageResource(newImageResource)


        }




    }
}
    }
}