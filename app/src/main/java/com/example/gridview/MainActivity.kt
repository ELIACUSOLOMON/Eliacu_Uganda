package com.example.gridview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = ArrayList<House>()
        x.add(House(R.drawable.solex,"Eliacu","Nice guy"))
        x.add(House(R.drawable.solex,"Bwire","Teacher"))

        x.add(House(R.drawable.solex,"Mr Ojok","Best Facilitator"))
        x.add(House(R.drawable.solex,"Anold","Internet provider"))
        x.add(House(R.drawable.solex,"Silus","Late comer"))
        x.add(House(R.drawable.solex,"Robert","That guy"))

        x.add(House(R.drawable.solex,"Hassan","Desktop pc"))
        x.add(House(R.drawable.solex,"Arthur","Badest Dj"))
        x.add(House(R.drawable.solex,"Richmond","Cordinator"))

        x.add(House(R.drawable.solex,"Eliacu","Nice guy"))
        x.add(House(R.drawable.solex,"Bwire","Teacher"))

        x.add(House(R.drawable.solex,"Mr Ojok","Best Facilitator"))
        x.add(House(R.drawable.solex,"Anold","Internet provider"))
        x.add(House(R.drawable.solex,"Silus","Late comer"))
        x.add(House(R.drawable.solex,"Robert","That guy"))

        x.add(House(R.drawable.solex,"Hassan","Desktop pc"))
        x.add(House(R.drawable.solex,"Arthur","Badest Dj"))
        x.add(House(R.drawable.solex,"Richmond","Cordinator"))
        val m = HouseAdapter(this,x)
        val l = findViewById<GridView>(R.id.Grid_view)
        l.adapter = m

    }
    class HouseAdapter: BaseAdapter {
        var img: Context? = null

        var nam:ArrayList<House>? = null
        constructor(a: Context, b:ArrayList<House>):super(){
            this.img= a
            this.nam = b
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val pan = img!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val p = pan.inflate(R.layout.grid,null)//helps to access the element from the list group to th list view

            val tex = p.findViewById<TextView>(R.id.txtview1)
            val tex2 = p.findViewById<TextView>(R.id.txtview2)
            val ima = p.findViewById<ImageView>(R.id.imageView3)
            tex.text = nam!![position].name
            tex2.text = nam!![position].Details
            ima.setImageResource(nam!![position].image!!)
            return p
        }

        override fun getItem(position: Int): Any {
            return nam!![position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }



        override fun getCount(): Int {
         return nam!!.size
        }
    }

    }