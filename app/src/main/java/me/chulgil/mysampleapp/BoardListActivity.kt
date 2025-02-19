package me.chulgil.mysampleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import me.chulgil.mysampleapp.databinding.ActivityBoardListBinding
import me.chulgil.mysampleapp.databinding.ActivityLoginBinding
import me.chulgil.mysampleapp.databinding.ActivityMainBinding
import me.chulgil.mysampleapp.databinding.ActivityViewBinding

class BoardListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoardListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityBoardListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val writeBtn = binding.writeBtn
        writeBtn.setOnClickListener {
            val intent = Intent(this, BoardWriteActivity::class.java)
            startActivity(intent)
        }

    }
}