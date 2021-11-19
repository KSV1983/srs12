package ksv.stud.srs12

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ComponentsActivity : AppCompatActivity() {
    private lateinit var backBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_components)
        val componentsNameList: List<String> = listOf(
            "Activity",
            "Fragment",
            "SupportFragmentManager",
            "Menu",
            "ConstraintLayout",
            "LinearLayout",
            "Button",
            "TextView",
            "BottomNavigationView",
            "Intent",
            "Item",
            "Icon"
        )

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view1)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = ComponentsAdapter(componentsNameList)

        val intent = Intent(this, MainActivity::class.java)
        backBtn = findViewById(R.id.components_activity_back_btn)
        backBtn.setOnClickListener {
            startActivity(intent)
        }
    }
}