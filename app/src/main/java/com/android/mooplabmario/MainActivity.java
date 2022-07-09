package com.android.mooplabmario;

import android.os.Bundle;
import android.widget.ListView;

import com.android.mooplabmario.Adapter.Adapter;
import com.android.mooplabmario.Model.Model;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Model> models = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        BindData();

    }

    void BindData() {
        models.add(new Model("https://static.carmudi.co.id/LViEB4pT56lzeVeVtsnrVXAjWOM=/900x405/https://trenotomotif.com/ncs/images/BMW/BMW%20Z4/Exterior/Exterior_21.jpg", "Rp. 1.447.000.000"));
        models.add(new Model("https://cdns.klimg.com/otosia.com/p/bank/2022/04/02/bmw-indonesia-merilis-320i-m-sport-terbaru--harga-mulai-rp-895-juta-9e53e3.jpg", "Rp. 1.020.000.000"));
        models.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSV5rl-p0HKcwWByvtzvsNUaL_XDmFT6otv7A&usqp=CAU", "Rp. 1.255.000.000"));
        models.add(new Model("https://cdn.motor1.com/images/mgl/qzE0J/s3/2023-bmw-7-series-renderings.jpg", "Rp.2.170.000.000"));
        models.add(new Model("https://autonetmagz.com/wp-content/uploads/2020/06/bmw-m440i-2021-860x474.jpg", "Rp. 1.487.000.000"));
        models.add(new Model("https://apollo-singapore.akamaized.net/v1/files/uva1jegm74aj2-ID/image", "Rp. 1.850.000.000"));
        models.add(new Model("https://c8.alamy.com/comp/DXAP8A/bmw-220i-2014-sedan-all-new-series-small-sedan-DXAP8A.jpg", "Rp. 717.000.000"));
        models.add(new Model("https://bmwstoreindonesia.files.wordpress.com/2022/02/p90363230_lowres_the-all-new-bmw-1-se.jpg?w=750", "Rp. 550.000.000"));
        models.add(new Model("https://s3-id-jkt-1.kilatstorage.id/fastnlow/2017/09/Lahirnya-Kembali-BMW-8-Series-2.jpg", "Rp. 2.870.000.000"));
        models.add(new Model("https://cdn.motor1.com/images/mgl/LZXGL/s1/bmw-x7.jpg", "Rp. 2.620.000.000"));

        adapter = new Adapter(getApplicationContext(), models);
        lv.setAdapter(adapter);
    }
}
