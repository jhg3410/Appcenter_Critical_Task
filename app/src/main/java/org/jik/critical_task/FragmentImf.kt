package org.jik.critical_task

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentImf : Fragment() {
    private val list = listOf("홍길동","가나다","라마바","장희직")
    lateinit var recyclerview : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_imf, container, false)

        val profileList : MutableList<ProfileData> = mutableListOf()

        for(no in 0..99){
            val name = list[no%4]

            val profile = ProfileData(name)
            profileList.add(profile)
        }
        recyclerview=view.findViewById(R.id.recyclerView) as RecyclerView
        recyclerview.layoutManager = LinearLayoutManager(activity)
        recyclerview.adapter = CustomAdapter(profileList)

        return  view
    }
}