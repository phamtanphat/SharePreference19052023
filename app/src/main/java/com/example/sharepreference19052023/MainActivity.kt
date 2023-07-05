package com.example.sharepreference19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var edtEmail: EditText? = null
    private var edtPassword: EditText? = null
    private var checkBoxSaveAccount: CheckBox? = null
    private var btnLogin: Button? = null
    private var tvOutputAccount: TextView? = null
    private var imgDelete: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtEmail = findViewById(R.id.edit_text_email)
        edtPassword = findViewById(R.id.edit_text_password)
        checkBoxSaveAccount = findViewById(R.id.check_box_save)
        btnLogin = findViewById(R.id.button_login)
        tvOutputAccount = findViewById(R.id.text_view_output)
        imgDelete = findViewById(R.id.image_view_delete)

        // Yeu cau
        // 1 - Nếu đăng nhập thành công và có chọn vào check box thì lưu tài khoản
        // 2 - Khi mở lại app nếu có dữ liệu thì hiển thị cho phần input và
        // 3- Thực hiện xoá dữ liệu
        //    - Khi người dùng đăng nhập nhưng không chọn vào check box
        //    - Khi click icon delete của output

    }
}