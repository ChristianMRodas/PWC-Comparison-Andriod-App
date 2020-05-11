package com.example.pwccomparisonandriodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Sets up the back button
        val navBackBtn = supportActionBar
        navBackBtn!!.title = "Sea Doo Models"
        //set back button
        navBackBtn.setDisplayHomeAsUpEnabled(true)
        navBackBtn.setDisplayHomeAsUpEnabled(true)

        faqbuttons.setOnClickListener {
            val intent = Intent(this, FAQActivity::class.java)

            startActivity(intent)
        }


        //Initializes next spinner (models) for the user to pick from
        val spinner2: Spinner = findViewById(R.id.models_spinner)
        //val spinner = Spinner(this)

        //from array
        ArrayAdapter.createFromResource(
            this,R.array.models_Seadoo_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinner2.adapter = adapter

        }


        spinner2.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                p: Int,
                l: Long
            ) {
                //Makes a toast from what the user selected in the spinner
                //Toast.makeText(this@SecondActivity, spinner2.selectedItem.toString(),   Toast.LENGTH_SHORT).show()

                val text: String = spinner2.getSelectedItem().toString()
                val selectedItem = spinner2.getItemAtPosition(p)

                //Changes image depending on user selection
                //If user changes selection, image is removed (hidden)

                if (selectedItem.equals("Spark") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: Spark model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_Trixx.visibility = View.VISIBLE
                }
                else
                    imgB_Trixx.visibility = View.INVISIBLE


                if (selectedItem.equals("Spark Trixx") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: Spark Trixx model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_Trixx.visibility = View.VISIBLE
                }
                else
                    imgB_Trixx.visibility = View.INVISIBLE

                if (selectedItem.equals("GTI 90/130") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: GTI 90/130 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_gti90130.visibility = View.VISIBLE
                }
                else
                    imgB_gti90130.visibility = View.INVISIBLE

                if (selectedItem.equals("GTI SE 130/170") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: GTI SE 130/170 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_gtise130170.visibility = View.VISIBLE
                }
                else
                    imgB_gtise130170.visibility = View.INVISIBLE

                if (selectedItem.equals("GTX Limited 230/300") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: GTX Limited 230/300 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_gtxlimited230300.visibility = View.VISIBLE
                }
                else
                    imgB_gtxlimited230300.visibility = View.INVISIBLE

                if (selectedItem.equals("GTX 170/230") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: GTX 170/230 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_gtx170230.visibility = View.VISIBLE
                }
                else
                    imgB_gtx170230.visibility = View.INVISIBLE

                if (selectedItem.equals("Wake Pro 230") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: Wake Pro 230 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_wakepro230.visibility = View.VISIBLE
                }
                else
                    imgB_wakepro230.visibility = View.INVISIBLE

                if (selectedItem.equals("Wake 170") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: Wake 170 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_wake170.visibility = View.VISIBLE
                }
                else
                    imgB_wake170.visibility = View.INVISIBLE

                if (selectedItem.equals("GTR 230") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: GTR 230 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_gtr230.visibility = View.VISIBLE
                }
                else
                    imgB_gtr230.visibility = View.INVISIBLE

                if (selectedItem.equals("RXP-X 300") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: RXP-X 300 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_rxpx300.visibility = View.VISIBLE
                }
                else
                    imgB_rxpx300.visibility = View.INVISIBLE

                if (selectedItem.equals("RXT-X 300") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: RXT-x 300 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_rxtx300.visibility = View.VISIBLE
                }
                else
                    imgB_rxtx300.visibility = View.INVISIBLE

                if (selectedItem.equals("Fish Pro") == true) {
                    Toast.makeText(this@SecondActivity, "Selected: Fish Pro model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_fishpro.visibility = View.VISIBLE
                }
                else
                    imgB_fishpro.visibility = View.INVISIBLE




            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                return
            }

        })









    }
    //Places back on the top of the naviation bar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
