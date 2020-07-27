package sg.edu.rp.c346.id18015871.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.listViewContacts);
        alContactList=new ArrayList<>();
        Contact item1 = new Contact("Mary",65,6442334,'F');
        alContactList.add(item1);
        Contact item2 = new Contact("Ken",65,97442437,'M');
        alContactList.add(item2);

        caContact=new CustomAdapter(this,R.layout.row,alContactList);
        lvContact.setAdapter(caContact);

    }
}
