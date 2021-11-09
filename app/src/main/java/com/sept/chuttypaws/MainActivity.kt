package com.sept.chuttypaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        // var imagePhoto: ImageView = findViewById(R.id.imagePhoto)
        // var model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        // Picasso.get().load(model.callUrlImage()).into(imagePhoto);
    }
}