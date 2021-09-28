package com.example.alkhurayyif_linah_studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_cardview.view.*

class StudyAdapter(private val activity: Activity,private val carditems: ArrayList<ArrayList<String>>): RecyclerView.Adapter<StudyAdapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.items_cardview,
                parent,
                false ))}
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.itemView.apply {
            Titletext.text = carditems[position][0]
            Detailstext.text= carditems[position][1]
            Card.setOnClickListener{customAlert(activity,carditems[position][0],carditems[position][1])}
        }
    }
    override fun getItemCount() = carditems.size}