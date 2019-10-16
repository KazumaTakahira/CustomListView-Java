package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String titles[] = {"JavaScript", "Python", "Java", "C/CPP", "PHP",
                "Swift", "Kotlin", "C#", "Ruby", "Haskell", "Objective-C", "Go", "Rust", "Elm"};
        String tags[] = {"dynamic", "dynamic", "static", "static", "dynamic",
                "static", "static", "static", "dynamic", "static", "static", "static", "static", "static"};
        String descs[] = {
                "console.log(\"Hello, World!\");",
                "print(\"Hello, World!\")",
                "System.out.println(\"Hello, World!\");",
                "printf(\"Hello, World!\");",
                "echo \"Hello, World!\"",
                "print(\"Hello, World!\")",
                "println(\"Hello, World!\")",
                "System.Console.WriteLine(\"Hello, World!\");",
                "puts \"Hello, World!\";",
                "main = putStrLn \"Hello, World!\"",
                "NSLog(@\"Hello, World!\");",
                "fmt.Println(\"Hello, World!\")",
                "println!(\"Hello, World!\");",
                "main = text \"Hello, World!\"",
        };

        ArrayList<HashMap<String, String>> data = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            HashMap<String, String> item = new HashMap<>();
            item.put("title", titles[i]);
            item.put("tag", tags[i]);
            item.put("desc", descs[i]);
            data.add(item);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this, data, R.layout.item_list,
                new String[]{"title", "tag", "desc"},
                new int[]{R.id.title, R.id.tag, R.id.desc});

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(simpleAdapter);
    }
}