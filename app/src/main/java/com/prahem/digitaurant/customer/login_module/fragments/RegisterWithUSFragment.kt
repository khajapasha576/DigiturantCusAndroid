package com.prahem.digitaurant.customer.login_module.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prahem.digitaurant.customer.R
import com.prahem.digitaurant.customer.login_module.acitivity.LoginActivity
import kotlinx.android.synthetic.main.fragment_register_with_u_s.view.*


class RegisterWithUSFragment : Fragment() {


    var v:View? = null;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_register_with_u_s, container, false)
        initListeners();
        return v;
    }

    private fun initListeners() {
        v!!.tv_login.setOnClickListener {

                (activity as LoginActivity).moveLeft(0)
        }
    }


}