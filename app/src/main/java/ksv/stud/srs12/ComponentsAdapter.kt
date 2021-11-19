package ksv.stud.srs12

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ComponentsAdapter(private val componentsList:List<String>):RecyclerView.Adapter<ComponentsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentsViewHolder {
        val componentsItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.components_list_item,parent,false)

        return ComponentsViewHolder(componentsItemView)
    }

    override fun onBindViewHolder(holder: ComponentsViewHolder, position: Int) {
        val componentName=componentsList[position]
        holder.bind(componentName)
    }

    override fun getItemCount(): Int {
        return componentsList.size
    }
}

