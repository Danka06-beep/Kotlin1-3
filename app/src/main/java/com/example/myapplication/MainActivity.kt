package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val post = Post(1,"Dan",1634045445261,"la la la", like = true, comment = false, share = true,3,0,1 )
        inthat(post)
    }
    private fun isTrue(post : Post) {
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

    fun inthat(post: Post) {

        authorxt.text = post.author
        txt.text = post.txt
        if (post.likeTxt > 0) {
            likeTxt.text = post.likeTxt.toString()
        }
        if (post.commentTxt > 0) {
            commentTxt.text = post.commentTxt.toString()
        }
        if (post.shareTxt > 0) {
            shareTxt.text = post.shareTxt.toString()
        }

        datetxt.text = date(post)
        isTrue(post)

    }

     fun date(post: Post): String {
        val publishedAgo =  (System.currentTimeMillis() - post.data) / 1000
        val toMin = if (publishedAgo > 3599) {
            publishedAgo / 3600
        } else {
            publishedAgo / 60
        }
        return when (publishedAgo) {
            in 0..59 -> "менее минуты назад"
            in 60..179 -> "минуту назад"
            in 180..299 -> "$toMin минуты назад"
            in 300..3599 -> "$toMin минут назад"
            in 3600..17999 -> "$toMin часа назад"
            else -> "$toMin часов назад "
        }
    }
}









