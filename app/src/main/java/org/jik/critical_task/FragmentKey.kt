package org.jik.critical_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class FragmentKey : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_key, container, false)
        val txt = view.findViewById<TextView>(R.id.txt)

        for(i in 0..9) {
            val btn = view.findViewById<Button>(R.id.button+i)
            btn.setOnClickListener {
                if(txt.length() == 3)   txt.append("-")
                if(txt.length() == 8)   txt.append("-")
                if(txt.length() == 13)  txt.append("-")
                txt.append(i.toString())
            }
        }

        view.findViewById<Button>(R.id.buttonback).setOnClickListener {
            if(txt.length() == 5)   txt.text = txt.text.toString().substring(0,txt.length()-1)
            if(txt.length() == 10)  txt.text = txt.text.toString().substring(0,txt.length()-1)
            if(txt.length() == 15)  txt.text = txt.text.toString().substring(0,txt.length()-1)
            txt.text = txt.text.toString().substring(0,txt.length()-1)
        }
        view.findViewById<Button>(R.id.buttonpnd).setOnClickListener {
            txt.append("*")
        }
        return view
    }

}