package com.oneparchy.MikesInstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.oneparchy.MikesInstagram.fragments.ComposeFragment
import com.oneparchy.MikesInstagram.fragments.FeedFragment
import com.oneparchy.MikesInstagram.fragments.ProfileFragment
import com.parse.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG="MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(R.string.pseudo_app_name)
        supportActionBar?.setIcon(R.mipmap.ic_launcher_foreground)

        val fragmentManager: FragmentManager = supportFragmentManager
        val bottom_Navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_Navigation.setOnItemSelectedListener {
            //instantiate variable passed in as item (default = "it")
            item ->

            var fragmentToShow: Fragment? = null
            when (item.itemId) {
                R.id.actionHome -> {
                    fragmentToShow = FeedFragment()
                }
                R.id.actionCompose -> {
                    fragmentToShow = ComposeFragment()
                }
                R.id.actionProfile -> {
                    fragmentToShow = ProfileFragment()
                }
            }
            if (fragmentToShow != null) {
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragmentToShow).commit()
            }
            //Return true to signify that we have handled this user interaction
            true
        }

        // Set default fragment selection
        bottom_Navigation.selectedItemId = R.id.actionHome
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