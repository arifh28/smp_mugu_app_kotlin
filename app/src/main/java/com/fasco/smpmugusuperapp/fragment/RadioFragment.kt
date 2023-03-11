package com.fasco.smpmugusuperapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.fasco.smpmugusuperapp.R
import com.squareup.picasso.Picasso


class RadioFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_radio, container, false)
        val imageView = view.findViewById<ImageView>(R.id.gambarguru)
        Picasso.get()
            .load("https://smpmuh-cimanggu.sch.id/assets/front/assets/img/gallery/hero-header.png")
            .into(imageView)
        // Inflate the layout for this fragment
        return view

    }

    companion object {
        fun newInstance() = RadioFragment()
    }
}