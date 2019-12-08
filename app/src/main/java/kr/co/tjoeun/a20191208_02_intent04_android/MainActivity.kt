package kr.co.tjoeun.a20191208_02_intent04_android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
//            누구에게 전화를 걸지 정보를 미리 명시.
            val uri = Uri.parse("tel:01051123237")
//            어느 화면에 넘겨줄지 명시
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }


        callBtn.setOnClickListener {
//            누구에게 전화를 걸지 uri로 명시.
            val uri = Uri.parse("tel:01051123237")
            val intent = Intent(Intent.ACTION_CALL, uri)
            startActivity(intent)
        }


    }
}
