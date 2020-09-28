package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnMoveWithObject:Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)

        val btnDialPhone:Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                Intent(this@MainActivity, MoveActivity::class.java).also {
                    startActivity(it)
                }

                R.id.btn_move_activity_data -> {
                    val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
                    startActivity(moveWithDataIntent)
                }

                R.id.btn_move_activity_object; run {
                    val person = Person(
                        "DicodingAcademy",
                        5,
                        "academy@dicoding.com",
                        "Bandung"
                    )
                    val moveWithDataIntent =
                        Intent(this@MainActivity, MoveWithDataActivity::class.java)
                    moveWithDataIntent.putExtra(
                        MoveWithDataActivity.EXTRA_NAME,
                        "DicodingAcademy Boy"
                    )
                    startActivity(moveWithDataIntent)

                    R.id.btn_dial_number -> {
                    val phoneNumber = "081210841382"
                    val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                    startActivity(dialPhoneIntent)

                    val btnMoveForResult:Button = findViewById(R.id.btn_move_for_result)
                    btnMoveForResult.setOnClickListener(this)
                    tvResult = this.findViewById(R.id.tv_result);
                }
        }
    }
}
}
