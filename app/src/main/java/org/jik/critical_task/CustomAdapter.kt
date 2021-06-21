package org.jik.critical_task

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val datas: MutableList<ProfileData>) : RecyclerView.Adapter<CustomAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.Holder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int =  datas.size


    class Holder(View: View) : RecyclerView.ViewHolder(View){
        private val txtName: TextView = itemView.findViewById(R.id.name)

        fun bind(item: ProfileData){
            txtName.text = item.name
        }
    }

}