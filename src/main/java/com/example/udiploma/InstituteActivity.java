package com.example.udiploma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.udiploma.BottomShoot.InstituteDetailsFragment;
import com.example.udiploma.Model.Institute;
import com.example.udiploma.ViewHolder.InstituteViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class InstituteActivity extends AppCompatActivity {

    private List<Institute> barisal, chittagong, dhaka, khulna, mymensing, rajshahi, rangpur, sylhet;
    private LinearLayoutManager layoutManager;
    private String divId;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute);

        divId = getIntent().getStringExtra("div_id");
        Toast.makeText(this, "Institute: "+divId, Toast.LENGTH_SHORT).show();

        recyclerView = findViewById(R.id.recyclerId);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        barisal = new ArrayList<>();
        chittagong = new ArrayList<>();
        dhaka = new ArrayList<>();
        khulna = new ArrayList<>();
        mymensing = new ArrayList<>();
        rajshahi = new ArrayList<>();
        rangpur = new ArrayList<>();
        sylhet = new ArrayList<>();

        //barishal list
        barisal.add(new Institute("Barishal Polytechnic Institute" ,
                "Alekanda, Barishal","barishal"));
        barisal.add(new Institute("Patuakhali Polytechnic Institute" ,
                "Patuakhali","patuakhali"));
        barisal.add(new Institute("Bhola Polytechnic Institute" ,
                "Bhola Highsway Road, Bhola","bhola"));
        barisal.add(new Institute("Barguna Polytechnic Institute" ,
                "Barguna","barguna"));




        //chittagong list
        chittagong.add(new Institute("Bangladesh Sweden Polytechnic Institute" ,
                "Kaptai, Rangamati","sweden"));
        chittagong.add(new Institute("Chittagong Polytechnic Institute" ,
                "Nasirabad, Chittagong","ctg"));
        chittagong.add(new Institute("Chittagong Mohila Polytechnic Institute" ,
                "Port Link Road, Chittagong","ctg_mohila"));
        chittagong.add(new Institute("Cox's Bazar Polytechnic Institute" ,
                "Linkrod, Cox'sbazar","Coxpoly"));
        chittagong.add(new Institute("Comilla Polytechnic Institute" ,
                "Kotbari, Comilla","comilla"));
        chittagong.add(new Institute("Bangladesh Survey Institute" ,
                "Rammala, Comilla","survey"));
        chittagong.add(new Institute("Feni Polytechnic Institute" ,
                "Malipur, Feni","fenipoly"));
        chittagong.add(new Institute("Feni Computer Institute" ,
                "Ranir Hat, Feni","feni_computer"));
        chittagong.add(new Institute("Lakshmipur Polytechnic Institute" ,
                "Laxmipur","lakshmipur"));
        chittagong.add(new Institute("Chandpur Polytechnic Institute" ,
                "Kachua Upazila, Chandpur","chandpur"));
        chittagong.add(new Institute("Brahmanbaria Polytechnic Institute" ,
                "Islampur, Brahmanbaria","brahmanbaria"));


        //dhaka list
        dhaka.add(new Institute("Dhaka Polytechnic Institute" ,
                "Tejgaow Shilpo Alaka D-1208","dhaka"));
        dhaka.add(new Institute("Dhaka Mohila Polytechnic Institute" ,
                "Agargaow, Dhaka-1207","dhaka_mohila"));
        dhaka.add(new Institute("Tangail Polytechnic Institute" ,
                "Deowla, Tangail","tangail"));
        dhaka.add(new Institute("Norshingdhi Polytechnic Institute" ,
                "Norshingdhi","norshingdhi"));
        dhaka.add(new Institute("Munsigong Polytechnic Institute" ,
                "Mirkadim, Munsigong","munshigong"));
        dhaka.add(new Institute("Kishoregong Polytechnic Institute" ,
                "Kishoregong","kishoregong"));
        dhaka.add(new Institute("Gopalgong Polytechnic Institute" ,
                "Gopalgong","gopalgong"));
        dhaka.add(new Institute("Sherpur Polytechnic Institute" ,
                "Vatshala, Sherpur","sherpur"));
        dhaka.add(new Institute("Bangladesh Institute Of Glass And Survey" ,
                "Tejgaow Shilpo Alaka D-1208","glass"));
        dhaka.add(new Institute("Graphics Arts Institute" ,
                "Satmosjid Road mohammadpur d-1207","graphics"));
        dhaka.add(new Institute("Foridpur Polytechnic Institute" ,
                "Baytul aman,Foridpur","foridpur"));

        //khulna list
        khulna.add(new Institute("Khulna Polytechnic Institute" ,
                "Khalishpur, Khulna","khulna"));
        khulna.add(new Institute("Khulna Mohila Polytechnic Institute" ,
                "Khulna","khulna_mohila"));
        khulna.add(new Institute("Jessore Polytechnic Institute" ,
                "Shikkha Board, Kotoali, Jessore","jessore"));
        khulna.add(new Institute("Kushtia Polytechnic Institute" ,
                "M.M Hossain Road, Kushtia","kushtia"));
        khulna.add(new Institute("Satkhira Polytechnic Institute" ,
                "Kalaroa Road, Satkhira","satkhira"));
        khulna.add(new Institute("Jhenaidah Polytechnic Institute" ,
                "Jhenaidah","jhenaidah"));
        khulna.add(new Institute("Magura Polytechnic Institute" ,
                "Magura","magura"));

        //mymensing list
        mymensing.add(new Institute("Mymensingh Polytechic Institute" +
                "Mymensingh","Mymensing","mymensingh"));
        mymensing.add(new Institute("Shariatpur Polytechnic Institute" +
                "Burir hat, Shariatpur","Barishal","shariatpur"));

        //rajshahi list
        rajshahi.add(new Institute("Rajshahi Polytechnic Institute","Rajshahi, Rajshahi, Bangladesh","rajshahi"));
        rajshahi.add(new Institute("Rajshahi Mohila Polytechinic Institute","Rajshahi Bypass, Rajshahi 6203","rajshahi_mohila"));
        rajshahi.add(new Institute("Bogra Polytechnic Institute", "Sherpur Road, Bogra","bogra"));
        rajshahi.add(new Institute("Pabna Polytechnic Institute" ,
                "Polytechnic Road, Pabna","pabna"));
        rajshahi.add(new Institute("Naogaon Polytechnic Institute" ,
                "Doubelhati Road, Naogaon","naogaon"));
        rajshahi.add(new Institute("Sirajgonj Polytechnic Institute",
                "Kazipur Road, Sirajgonj","sirajgonj"));
        rajshahi.add(new Institute("Chapainawabgonj Polytechnic Institute","Chapainawabgonj","chapai"));
        rajshahi.add(new Institute("Vocational Teacher's Training Institute, Bogura","Sherpur Rd, Bogura","vtti"));
//
//        //rangpur list
        rangpur.add(new Institute("Rangpur Polytechnic Institute","Shalbon Mistry Para Road, Rangpur","rangpur"));
        rangpur.add(new Institute("Dinajpur Polytechnic Institute", "Balubari, Dinajpur","dinajpur"));
        rangpur.add(new Institute("Kurigram Polytechnic Institute","Central Jail Road, Kurigram","kurigram"));
        rangpur.add(new Institute("Thakurgaon Polytechnic Institute","Baliadangi Road Thakurgaon","thakurgaon"));
//        //sylhet list
        sylhet.add(new Institute("Sylhet Polytechnic Institute","Sylhet, Bangladesh","sylhet"));
        sylhet.add(new Institute("Habiganj Polytechnic Institute","Habigonj, Sylhet, Bangladesh","habiganj"));
        sylhet.add(new Institute("Moulvibazar Polytechnic Institute","Moulvibazar Bazar","maulvi_bazar"));

        switch (divId)
        {
            case "Barisal":
                showInstitute(barisal);
                break;
            case "Chittagong":
                showInstitute(chittagong);
                break;
            case "Dhaka":
                showInstitute(dhaka);
                break;
            case "Khulna":
                showInstitute(khulna);
                break;
            case "Mymensingh":
                showInstitute(mymensing);
                break;
            case "Rajshahi":
                showInstitute(rajshahi);
                break;
            case "Rangpur":
                showInstitute(rangpur);
                break;
            case "Sylhet":
                showInstitute(sylhet);
                break;
            default:
                break;
        }

    }

    private void showInstitute(final List<Institute> id_inst) {
        RecyclerView.Adapter<InstituteViewHolder> adapter = new RecyclerView.Adapter<InstituteViewHolder>() {
            @NonNull
            @Override
            public InstituteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.institute_list, parent, false);
                InstituteViewHolder holder = new InstituteViewHolder(view);
                return holder;
            }
            @Override
            public void onBindViewHolder(@NonNull final InstituteViewHolder holder, final int position) {
                holder.name.setText(id_inst.get(position).getName());
                holder.address.setText(id_inst.get(position).getAddress());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        InstituteDetailsFragment fragment = new InstituteDetailsFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("ins_id", id_inst.get(position).getId());
                        fragment.setArguments(bundle);
                        fragment.show(getSupportFragmentManager(),fragment.getTag());
                    }
                });
            }

            @Override
            public int getItemCount() {
                return id_inst.size();
            }
        };

        recyclerView.setAdapter(adapter);
    }
}
