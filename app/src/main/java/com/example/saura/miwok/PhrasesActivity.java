package com.example.saura.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        //Word w=new Word("one","lutti");creating a word object
        //words.add(w); adding word object to words list
        words.add(new Word("father","epa",R.raw.number_two));
        words.add(new Word("mother","eta",R.raw.number_two));
        words.add(new Word("son","angsi",R.raw.number_two));
        words.add(new Word("daughter","tune",R.raw.number_two));
        words.add(new Word("older brother","taachi",R.raw.number_two));
        words.add(new Word("younger brother","chalitti",R.raw.number_two));
        words.add(new Word("older sister","tete",R.raw.number_two));
        words.add(new Word("younger sister","kolliti",R.raw.number_two));
        words.add(new Word("grandmother","ama",R.raw.number_two));
        words.add(new Word("grandfather","paapa",R.raw.number_two));
        //finding view by id


        //while loop


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
