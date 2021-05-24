package com.prahem.digitaurant.customer.login_module.fragments

import android.R.attr.editable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.prahem.digitaurant.customer.R
import com.prahem.digitaurant.customer.login_module.acitivity.LoginActivity
import com.prahem.digitaurant.customer.login_module.extra.GenericTextWatcher
import kotlinx.android.synthetic.main.fragment_o_t_p.view.*


class OTPFragment : Fragment(), TextWatcher {


    lateinit var v:View;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_o_t_p, container, false)
        initListeners();
        return v;
    }

    private fun initListeners() {
        v.tv_login.setOnClickListener {
            (activity as LoginActivity).moveLeft(2)
        }
        v.tv_change_mobile.setOnClickListener {
            (activity as LoginActivity).moveLeft(0)
        }

        val edit =
            arrayOf<EditText>(v.et_OTP1, v.et_OTP2, v.et_OTP3, v.et_OTP4, v.et_OTP5, v.et_OTP6)

        v.et_OTP1.addTextChangedListener(GenericTextWatcher(v.et_OTP1, edit))
        v.et_OTP2.addTextChangedListener(GenericTextWatcher(v.et_OTP2, edit))
        v.et_OTP3.addTextChangedListener(GenericTextWatcher(v.et_OTP3, edit))
        v.et_OTP4.addTextChangedListener(GenericTextWatcher(v.et_OTP4, edit))
        v.et_OTP5.addTextChangedListener(GenericTextWatcher(v.et_OTP5, edit))
        v.et_OTP6.addTextChangedListener(GenericTextWatcher(v.et_OTP6, edit))
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {    }

    override fun afterTextChanged(s: Editable?) {
        val text = editable.toString()
        when (s) {
            v.et_OTP1 -> if (text.length == 1) v.et_OTP2.requestFocus()
            v.et_OTP2 -> if (text.length == 1) v.et_OTP3.requestFocus() else if (text.length == 0) v.et_OTP1.requestFocus()
            v.et_OTP3 -> if (text.length == 1) v.et_OTP4.requestFocus() else if (text.length == 0) v.et_OTP2.requestFocus()
            v.et_OTP4 -> if (text.length == 1) v.et_OTP5.requestFocus() else if (text.length == 0) v.et_OTP3.requestFocus()
            v.et_OTP5 -> if (text.length == 1) v.et_OTP6.requestFocus() else if (text.length == 0) v.et_OTP4.requestFocus()
            v.et_OTP6 -> if (text.length == 0) v.et_OTP5.requestFocus()
        }
    }
}