package com.example.recyclerview_adapter.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_adapter.R
import com.example.recyclerview_adapter.model.UserModel

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList = emptyList<UserModel>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

//        holder.itemView.tv_last_name.text = userList[position].lastName
//        holder.itemView.tv_first_name.text = userList[position].firstName

            holder.itemView.findViewById<TextView>(R.id.tv_first_name).text = userList[position].firstName
            holder.itemView.findViewById<TextView>(R.id.tv_last_name).text = userList[position].lastName
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>) {
        userList = list
        notifyDataSetChanged()
    }

}