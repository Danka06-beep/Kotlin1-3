package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post = Post(1,"Dan","10 october","la la la", like = true, comment = false, share = false )


    }
    fun isTrue(post : Post){
        if (post.like) {
            likeImgBtn.setImageResource(R.drawable.ic_baseline_favorite_24)
        }
        if (post.comment) {
            commentImgBtn.setImageResource(R.drawable.ic_baseline_comment_24)
        }
        if (post.share) {
            shareImgBtn.setImageResource(R.drawable.ic_baseline_share_24)
        }
    }

}