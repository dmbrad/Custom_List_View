package com.example.custom_list_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mctx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mctx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflator:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflator.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val titletextview:TextView=view.findViewById(R.id.Text)
        val subtext:TextView=view.findViewById(R.id.SubText)

        var mitem:Model=items[position]
        imageview.setImageDrawable(mctx.resources.getDrawable(mitem.img))
        titletextview.text=mitem.title
        subtext.text=mitem.description

        return view
    }
}