package ksv.stud.srs12

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComponentsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(componenetName: String) {
        val componentsNameTextView: TextView = itemView.findViewById(R.id.components_text_view)
        componentsNameTextView.text = componenetName
    }
}