package com.example.custom_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.List_View)
        var list= mutableListOf<Model>()

        //Add Images
        list.add(Model("Range Rover Sport","Is a powerful German Machine",R.drawable.range))
        list.add(Model("Bugatti","Its a luxurious car",R.drawable.bugatti))
        list.add(Model("Lamborghini","Mostly owned by rich people",R.drawable.lambo))
        list.add(Model("Mercedes G Wagon","It never disappoints when its off road",R.drawable.Gwagon))
        list.add(Model("Rolls Royce Phantom","Mostly owned by rich actors",R.drawable.rolls))
        list.add(Model("Ferrari","A good Racing Car",R.drawable.ferari))


        listview.adapter=MyAdapter(this,R.layout.row,list)

        listview.setOnItemClickListener { adapterView, view, position, l ->
            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on Range Rover Sport",Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked on Bugatti",Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked on Lamborghini",Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked on Mercedes G Wagon",Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You have clicked on Rolls Royce Phantom",Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity,"You have clicked on Ferrari",Toast.LENGTH_LONG).show()
            }
        }
    }
}