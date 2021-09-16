package com.example.tienda_de_guitarras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tienda_de_guitarras.databinding.ActivityMainBinding

lateinit var bind: ActivityMainBinding
val guitarras= listOf(Guitarras("telecaster player series","telecaster","640","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/439170.webp"),
    Guitarras("Tom morello strato","strato","1400","https://thumbs.static-thomann.de/thumb/thumb250x220/pics/prod/483537.jpg"),
    Guitarras("Mascis telecaster","Telecaster","1300","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/523813.webp"),
    Guitarras("Bret Manson","telecaster","2300","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/497572.webp"),
    Guitarras("Gibson les paul tribute","les paul","1050","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/462488.webp"),
    Guitarras("Gibson standard","les paul","1450","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/462465.webp"),
    Guitarras("PRS floyd 5","Prs","770","https://thumbs.static-thomann.de/thumb/thumb220x220/pics/prod/510480.webp"))



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)

        setContentView(bind.root)
        recyclerinit()
    }
    fun recyclerinit(){
        val adapter=Guitaradapter(guitarras)
        bind.recycler.layoutManager= LinearLayoutManager(this)
        bind.recycler.adapter=adapter
    }
}