package br.senai.sp.jandira.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import br.senai.sp.jandira.testfragment.fragments.ConsoleFragment
import br.senai.sp.jandira.testfragment.fragments.GameFragment
import br.senai.sp.jandira.testfragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),
    View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var buttonHome: Button
    private lateinit var buttonConsoles: Button
    private lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var gameFragment: GameFragment
    private lateinit var consoleFragment: ConsoleFragment

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonHome = findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)

        buttonConsoles = findViewById(R.id.button_consoles)
        buttonConsoles.setOnClickListener(this)

        buttonGames = findViewById(R.id.buttons_games)
        buttonGames.setOnClickListener(this)

        homeFragment = HomeFragment()
        gameFragment = GameFragment()
        consoleFragment = ConsoleFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, homeFragment).commit()

    }

    override fun onClick(v: View) {

        if (v.id == R.id.button_home) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame, homeFragment)
                .commit()
        } else if (v.id == R.id.buttons_games) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame, gameFragment)
                .commit()
        } else {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame, consoleFragment)
                .commit()
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.menu_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, homeFragment)
                    .commit()
            }
            R.id.menu_console -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, consoleFragment)
                    .commit()
            }
            R.id.menu_game -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, gameFragment)
                    .commit()
            }
        }

        return true
    }


}