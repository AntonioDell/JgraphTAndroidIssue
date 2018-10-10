package de.prototype.antonio.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jgrapht.Graph

class MainActivity : AppCompatActivity() {

    var graph: Graph<Int, Int>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
