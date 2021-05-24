package com.prahem.digitaurant.customer.login_module.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.prahem.digitaurant.customer.R
import com.prahem.digitaurant.customer.login_module.acitivity.LoginActivity


class PhoneNumberFragment : Fragment() {

    private var v :View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       v =  inflater.inflate(R.layout.fragment_phone_number, container, false)
        initListener();
        return  v;
    }

    private fun initListener() {
        v!!.findViewById<TextView>(R.id.tv_login).setOnClickListener {
            (activity as LoginActivity).moveLeft(1)
        }
    }

}