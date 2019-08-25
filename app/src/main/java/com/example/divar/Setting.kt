package com.example.divar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Setting :Fragment(){

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            var view: View = inflater.inflate(R.layout.setting, container, false)
            return view
        }


    }

