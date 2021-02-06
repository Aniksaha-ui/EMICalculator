package com.example.emicalculator

import StatsticsAdapter
import android.annotation.SuppressLint
import android.os.Build.VERSION_CODES.P
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout.*
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.security.Principal
import android.widget.LinearLayout as LinearLayout1
import androidx.recyclerview.widget.LinearLayoutManager as LinearLayoutManager


class StatiscticsActivity : AppCompatActivity() {

    private var yearCount: TextView?=null
    private var principleCount:TextView?=null
    private var interestCount:TextView?=null
    private var balanceCount:TextView?=null



    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statisctics)


        val bundle = intent.extras
        if (bundle!= null){
            val P = bundle!!.getString("P")
            val N= bundle!!.getString("N")
            val I=bundle!!.getString("I")

        }

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager=LinearLayoutManager(this@StatiscticsActivity, LinearLayout1.VERTICAL,
            false)
        val count = ArrayList<StatisticsData>()



        var P = bundle!!.getString("P")!!.toFloat()
        var N= bundle!!.getString("N")!!.toFloat()
        var I= bundle!!.getString("I")!!.toFloat()
        var Emi=bundle!!.getString("Emi")!!.toFloat()
        var i=1


        while (P>=0.0){

            var givenInterest:Float=(P*I)/(12*100)
            var givenPrincipal:Float=(Emi-givenInterest)
            P=P-givenPrincipal

            count.add(StatisticsData(i.toString(),givenPrincipal.toString(), givenInterest.toString(),P.toString()))
            i++
        }
        //creating our adapter
        val adapter = StatsticsAdapter(count)
        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter

    }
}