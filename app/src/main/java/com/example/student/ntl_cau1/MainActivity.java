package com.example.student.ntl_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btndangnhap,btnout;
CheckBox save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndangnhap = (Button)findViewById(R.id.btnDN);
        save=(CheckBox)findViewById(R.id.checksave);
        btnout=(Button)findViewById(R.id.btnthoat);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (save.isChecked()==true)
                    Toast.makeText(getApplicationContext(),"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();

                else
                        Toast.makeText(getApplicationContext(),"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_SHORT).show();
            }
        });
        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(v.OnContextClickListener());
                builder.setMessage(getResources().getString(R.string.message_dialog_exist));
                builder.setTitle(getResources().getString(R.string.message_dialog_exist_title));
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton(getResources().getString(R.string.message_dialog_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                });
                builder.setNegativeButton(getResources().getString(R.string.message_dialog_cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                    });
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });
    }
}
