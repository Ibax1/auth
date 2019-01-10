package com.example.ixuba.authorization

import android.app.PendingIntent.getActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        showAuth()
    }

    private fun showAuth() {
        val fragment = AuthFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.entry_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun showMain() {
        val fragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.entry_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    public fun onAuthSuccess() {
        supportFragmentManager.popBackStack();
        showMain()
    }
}

class AuthFragment : Fragment() {

    fun onAuthSuccess(){
        // TODO(“show main fragment”)
        ((EntryActivity)getActivity()).onAuthSuccess();
    }
}

class MainFragment : Fragment()

