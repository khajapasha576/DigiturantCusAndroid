package com.prahem.digitaurant.customer.login_module.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prahem.digitaurant.customer.R

// TODO: Rename parameter arguments, choose names that match
class Fragment1 : Fragment() {

    var v:View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         v = inflater.inflate(R.layout.fragment_1, container, false)
        initListeners();
        return v;
    }

    private fun initListeners() {

    }


}