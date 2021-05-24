package com.prahem.digitaurant.customer.login_module.acitivity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prahem.digitaurant.customer.R
import com.prahem.digitaurant.customer.login_module.fragments.*
import com.prahem.digitaurant.customer.login_module.interfaces.SwipeLeft


class LoginActivity : AppCompatActivity(),SwipeLeft {
    var context:Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initListeners();
    }

    private fun initListeners() {
//        rv_header.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//        rv_header.adapter = HeaderAdapter(context)
        supportFragmentManager.beginTransaction().replace(R.id.frm_login, PhoneNumberFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.frm_header, Fragment1()).commit()
    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }
    override fun moveLeft(position: Int) {

        when(position){
            0->{
                supportFragmentManager.beginTransaction().replace(R.id.frm_login, PhoneNumberFragment())
                    .addToBackStack(null) .commit()
                val transaction =  supportFragmentManager.beginTransaction()
                transaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_to_right);
                transaction.replace(R.id.frm_header, Fragment1()).addToBackStack(null).commit()
            }
            1->{
                supportFragmentManager.beginTransaction().replace(R.id.frm_login, OTPFragment())
                    .addToBackStack(null).commit()

                val transaction = supportFragmentManager.beginTransaction()
                transaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_left)
                transaction .replace(R.id.frm_header, Fragment2()).addToBackStack(null).commit()
            }
            2->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frm_login, RegisterWithUSFragment()).addToBackStack(null).commit()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_left)
                transaction .replace(R.id.frm_header, Fragment3()).addToBackStack(null).commit()
            }
        }

    }
}