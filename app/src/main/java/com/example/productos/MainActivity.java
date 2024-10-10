package com.example.productos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Product("Camiseta", "$15.00", R.drawable.product_image1));
        productList.add(new Product("Pantalones", "$25.00", R.drawable.product_image2));
        productList.add(new Product("Chaqueta", "$40.00", R.drawable.product_image3));
        productList.add(new Product("Zapatos", "$30.00", R.drawable.product_image4));
        productList.add(new Product("Sombrero", "$10.00", R.drawable.product_image5));

        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}
