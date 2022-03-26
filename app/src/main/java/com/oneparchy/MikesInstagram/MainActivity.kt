package com.oneparchy.MikesInstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.parse.ParseObject
import com.parse.ParseUser

/*
    Let user create a post by taking a photo with their camera
 */

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG="MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstObject = ParseObject("FirstClass")
        firstObject.put("message","Hey ! First message from android. Parse is now connected")
        firstObject.saveInBackground {
            if (it != null){
                it.localizedMessage?.let { message -> Log.e(TAG, message) }
            }else{
                Log.d(TAG,"Object saved.")
            }
        }
    }
    //Inflate menu options and tie to this activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    //Handle clicks on menu item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.miLogout) {
            ParseUser.logOutInBackground()
            goToLoginActivity()
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    //Go to Login activity
    private fun goToLoginActivity() {
        val i = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(i)
        finish()
    }
}