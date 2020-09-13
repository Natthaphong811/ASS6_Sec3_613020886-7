package com.example.ass6menufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(
                R.id.frameLayout,
                OneFragment()
            ).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager = supportFragmentManager
        val transition = manager.beginTransaction()
        when(item?.itemId){
            R.id.icon -> {
                transition.replace(R.id.frameLayout, TwoFragment())
                transition.addToBackStack(null)
                transition.commit()
                return true
            }
            R.id.icon2 -> {
                transition.replace(R.id.frameLayout, ThreeFragment())
                transition.addToBackStack(null)
                transition.commit()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}