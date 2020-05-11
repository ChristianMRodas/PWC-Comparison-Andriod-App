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
import kotlinx.android.synthetic.main.activity_kawasaki.*
import kotlinx.android.synthetic.main.activity_main.*


class KawasakiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawasaki)

        //Sets up the back button
        val navBackBtn = supportActionBar
        navBackBtn!!.title = "Kawasaki Models"
        //set back button
        navBackBtn.setDisplayHomeAsUpEnabled(true)
        navBackBtn.setDisplayHomeAsUpEnabled(true)

        faqbuttonk.setOnClickListener {
            val intent = Intent(this, FAQActivity::class.java)

            startActivity(intent)
        }


        //Initializes next spinner (models) for the user to pick from
        val spinnerK: Spinner = findViewById(R.id.models_spinnerr)

        ArrayAdapter.createFromResource(
            this,R.array.models_Kawasaki_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinnerK.adapter = adapter

        }

        spinnerK.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                p: Int,
                l: Long
            ) {
                //Makes a toast from what the user selected in the spinner
                //Toast.makeText(this@SecondActivity, spinner2.selectedItem.toString(),   Toast.LENGTH_SHORT).show()

                val text: String = spinnerK.getSelectedItem().toString()
                val selectedItem = spinnerK.getItemAtPosition(p)

                //Changes image depending on user selection
                //If user changes selection, image is removed (hidden)

                if (selectedItem.equals("SX-R") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: SX-R model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_SXR.visibility = View.VISIBLE
                }
                else
                    imgB_SXR.visibility = View.INVISIBLE

                if (selectedItem.equals("STX 160") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: STX 160 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_STX160.visibility = View.VISIBLE
                }
                else
                    imgB_STX160.visibility = View.INVISIBLE

                if (selectedItem.equals("STX 160X") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: STX 160 model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_STX160X.visibility = View.VISIBLE
                }
                else
                    imgB_STX160X.visibility = View.INVISIBLE

                if (selectedItem.equals("STX 160LX") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: STX 160LX model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_STX160LX.visibility = View.VISIBLE
                }
                else
                    imgB_STX160LX.visibility = View.INVISIBLE

                if (selectedItem.equals("STX -15F") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: STX -15F model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_STX15F.visibility = View.VISIBLE
                }
                else
                    imgB_STX15F.visibility = View.INVISIBLE

                if (selectedItem.equals("Ultra LX") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: Ultra LX model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_UltraLX.visibility = View.VISIBLE
                }
                else
                    imgB_UltraLX.visibility = View.INVISIBLE

                if (selectedItem.equals("Ultra 310X") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: Ultra 310X model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_Ultra310X.visibility = View.VISIBLE
                }
                else
                    imgB_Ultra310X.visibility = View.INVISIBLE

                if (selectedItem.equals("Ultra 310X SE") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: Ultra 310X SE model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_Ultra310XSE.visibility = View.VISIBLE
                }
                else
                    imgB_Ultra310XSE.visibility = View.INVISIBLE

                if (selectedItem.equals("Ultra 310R") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: Ultra 310R model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_310R.visibility = View.VISIBLE
                }
                else
                    imgB_310R.visibility = View.INVISIBLE

                if (selectedItem.equals("Ultra 310LX") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: Ultra 310LX model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_Ultra310LX.visibility = View.VISIBLE
                }
                else
                    imgB_Ultra310LX.visibility = View.INVISIBLE






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
