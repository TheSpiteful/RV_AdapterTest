package com.example.recyclerview_adapter


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_adapter.adapter.UserAdapter
import com.example.recyclerview_adapter.databinding.ActivityMainBinding
import com.example.recyclerview_adapter.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()

        val user = UserModel("Dmytro", "Moroz")
        userList.add(user)

        val user2 = UserModel("Dmytro1", "Moroz")
        userList.add(user2)

        val user3 = UserModel("Dmytro2", "Moroz")
        userList.add(user3)

        val user4 = UserModel("Dmytro3", "Moroz")
        userList.add(user4)

        return userList
    }
}