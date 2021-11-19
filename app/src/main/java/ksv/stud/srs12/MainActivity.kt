package ksv.stud.srs12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, ComponentsActivity::class.java)

        bottomMenu = findViewById(R.id.bottom_navigation_view1)
        bottomMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.about_author_item -> {
                    fragment = aboutAuthorFragment()

                }
                R.id.about_app_item -> {
                    fragment = aboutAppFragment()
                  
                }
                R.id.thanks_item -> {
                    fragment = thanksFragment()

                }
                R.id.components_item -> {
                    startActivity(intent)
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.about_author_item

         }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}