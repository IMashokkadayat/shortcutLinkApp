package com.example.shortcut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.widget.ImageView
import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageButton

//import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
//import android.webkit.WebView


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextbtn = findViewById<Button>(R.id.okbtn)
        nextbtn.setOnClickListener {
            setContentView(R.layout.secondlayout)

            //study materials links button
            val studybtn = findViewById<Button>(R.id.stdbtn)
            studybtn.setOnClickListener {
                setContentView(R.layout.studylayout)

                val tbtn = findViewById<Button>(R.id.Tp)
                tbtn.setOnClickListener {
                    val url = "https://www.tutorialspoint.com/index.htm"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    startActivity(intent)
                }
                val wbtn = findViewById<Button>(R.id.ws)
                wbtn.setOnClickListener {
                    val url1 = "https://www.w3schools.com/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url1)
                    startActivity(intent)
                }
                val gbtn = findViewById<Button>(R.id.GG)
                gbtn.setOnClickListener {
                    val url2 = "https://www.geeksforgeeks.org/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url2)
                    startActivity(intent)
                }
                val pbtn = findViewById<Button>(R.id.Pr)
                pbtn.setOnClickListener {
                    val url3 = "https://www.programiz.com/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url3)
                    startActivity(intent)
                }
                val cabtn = findViewById<Button>(R.id.ca)
                cabtn.setOnClickListener {
                    val url4 = "https://www.codecademy.com/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url4)
                    startActivity(intent)
                }
                val slbtn = findViewById<Button>(R.id.sl)
                slbtn.setOnClickListener {
                    val url5 = "https://www.simplilearn.com/?utm_source=bing&utm_medium=cpc&utm_term=simplilearn&utm_content=392503905-1320514564874663-&utm_device=c&utm_campaign=B-Search-Brand-Exact-IN-AllDevice-adgroup-brand-simplilearn&msclkid=17cc7addd92f1e4188331e8519a4fa6b"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url5)
                    startActivity(intent)
                }
                val Gbtn = findViewById<Button>(R.id.Gg)
                Gbtn.setOnClickListener {
                    val url6 = "https://www.guru99.com/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url6)
                    startActivity(intent)
                }
            }

            //compiler layout option
            val compilerbtn = findViewById<Button>(R.id.combtn)
            compilerbtn.setOnClickListener {
                setContentView(R.layout.compilerlayout)
                val l1btn = findViewById<Button>(R.id.l1)
                l1btn.setOnClickListener {
                    val urlcpp1 = "https://www.programiz.com/cpp-programming/online-compiler/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlcpp1)
                    startActivity(intent)
                }
                val l2btn = findViewById<Button>(R.id.l2)
                l2btn.setOnClickListener {
                    val urlcpp2 = "https://www.onlinegdb.com/online_c++_compiler"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlcpp2)
                    startActivity(intent)
                }
                val l3btn = findViewById<Button>(R.id.l3)
                l3btn.setOnClickListener {
                    val urlcpp3 = "https://www.tutorialspoint.com/compile_cpp_online.php"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlcpp3)
                    startActivity(intent)
                }


                val ln1btn = findViewById<Button>(R.id.ln1)
                ln1btn.setOnClickListener {
                    val urlp1 = "https://www.programiz.com/python-programming/online-compiler/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlp1)
                    startActivity(intent)
                }
                val ln2btn = findViewById<Button>(R.id.ln2)
                ln2btn.setOnClickListener {
                    val urlp2 = "https://www.onlinegdb.com/online_python_compiler"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlp2)
                    startActivity(intent)
                }
                val ln3btn = findViewById<Button>(R.id.ln3)
                ln3btn.setOnClickListener {
                    val urlp3 = "https://www.online-python.com/online_python_compiler"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlp3)
                    startActivity(intent)
                }


                val link1btn = findViewById<Button>(R.id.link1)
                link1btn.setOnClickListener {
                    val url6 = "https://www.programiz.com/c-programming/online-compiler/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url6)
                    startActivity(intent)
                }
                val link2btn = findViewById<Button>(R.id.link2)
                link2btn.setOnClickListener {
                    val url6 = "https://ide.geeksforgeeks.org/online-c-compiler"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url6)
                    startActivity(intent)
                }
                val link3btn = findViewById<Button>(R.id.link3)
                link3btn.setOnClickListener {
                    val url6 = "https://www.tutorialspoint.com/compile_c_online.php"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url6)
                    startActivity(intent)
                }

            }

            //practice layout option
            val practicebtn = findViewById<Button>(R.id.prbtn)
            practicebtn.setOnClickListener {
                setContentView(R.layout.practicelayout)
                val pra1 = findViewById<Button>(R.id.llink1)
                pra1.setOnClickListener {
                    val urlpra1 = "https://www.codechef.com/practice"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlpra1)
                    startActivity(intent)
                }
                val pra2 = findViewById<Button>(R.id.llink2)
                pra2.setOnClickListener {
                    val urlpra2 = "https://www.hackerearth.com/practice/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlpra2)
                    startActivity(intent)
                }
                val pra3 = findViewById<Button>(R.id.llink3)
                pra3.setOnClickListener {
                    val urlpra3 = "https://www.hackerrank.com/domains/python"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlpra3)
                    startActivity(intent)
                }
                val pra4 = findViewById<Button>(R.id.llink4)
                pra4.setOnClickListener {
                    val urlpra4 = "https://www.codesdope.com/practice/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlpra4)
                    startActivity(intent)
                }


                val cbtn1 = findViewById<Button>(R.id.clink1)
                cbtn1.setOnClickListener {
                    val urlgoo1 = "https://codingcompetitions.withgoogle.com/kickstart"
                    val intent1 = Intent(Intent.ACTION_VIEW)
                    intent1.data = Uri.parse(urlgoo1)
                    startActivity(intent)
                }
                val cbtn2 = findViewById<Button>(R.id.clink2)
                cbtn2.setOnClickListener {
                    val urlgoo2 = "https://codingcompetitions.withgoogle.com/hashcode"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlgoo2)
                    startActivity(intent)
                }
                val cbtn3 = findViewById<Button>(R.id.clink3)
                cbtn3.setOnClickListener {
                    val urlgoo3 = "https://codingcompetitions.withgoogle.com/codejam"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(urlgoo3)
                    startActivity(intent)
                }



                }
            val searchbtn = findViewById<Button>(R.id.searchlay)
            searchbtn.setOnClickListener {
                setContentView(R.layout.searchlayout)
                val web_view = findViewById<WebView>(R.id.web_view)
                web_view.webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                        if (url != null) {
                            view?.loadUrl(url)
                        }
                        return true
                    }
                }
                val search_button = findViewById<ImageButton>(R.id.searchicon)
                search_button.setOnClickListener {
                    val strvalue = findViewById<EditText>(R.id.searchbar)
                    val query = strvalue.text.toString()
                    if (query.isNotEmpty()) {

                        val searchUrl = "https://www.google.com/search?q=$query"
                        web_view.loadUrl(searchUrl)
                    }
                }
            }
            }

            }
        }