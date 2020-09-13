package com.example.ass6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_two.view.*


class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_two, container, false)
        view.male.setOnClickListener(){
            var fragment = OneFragment()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(male: Fragment) {
        var transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, male)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}