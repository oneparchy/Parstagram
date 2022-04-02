package com.oneparchy.MikesInstagram

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.oneparchy.MikesInstagram.fragments.ComposeFragment
import com.oneparchy.MikesInstagram.fragments.FeedFragment
import com.oneparchy.MikesInstagram.models.Post
import com.parse.*
import java.io.File

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
                    //TODO fragmentToShow = ProfileFragment()
                }
            }
            if (fragmentToShow != null) {
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragmentToShow).commit()
            }
            //Return true to signify that we have handled this user interaction
            true
        }

        queryPosts()
        // Set default fragment selection
        bottom_Navigation.selectedItemId = R.id.actionHome
    }

    private fun queryPosts() {
        //Specify which class to query
        val query: ParseQuery<Post> = ParseQuery.getQuery(Post::class.java)
        //Find all the Post objects (including author)
        query.include(Post.KEY_USR)
        query.findInBackground(object : FindCallback<Post> {
            override fun done(posts: MutableList<Post>?, e: ParseException?) {
                if (e != null) {
                    Log.e(TAG, "Error retrieving posts")
                } else {
                    Log.i(TAG, "Posts query successful")
                    if (posts != null) {
                        for (post in posts) {
                            Log.i(TAG, "Post: " + post.getDescription() + ", User: " + post.getUser()?.username)
                        }
                    }
                }
            }
        } )
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