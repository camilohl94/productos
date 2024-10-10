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
        productList.add(new Product("Camiseta", "$15.00", R.drawable.product_camiseta));
        productList.add(new Product("Pantalones", "$25.00", R.drawable.product_pantalon));
        productList.add(new Product("Chaqueta", "$40.00", R.drawable.product_chaqueta));
        productList.add(new Product("Zapatos", "$30.00", R.drawable.product_zapatos));
        productList.add(new Product("Sombrero", "$10.00", R.drawable.product_sombrero));

        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}
