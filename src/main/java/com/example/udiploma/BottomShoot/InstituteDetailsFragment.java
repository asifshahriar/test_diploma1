package com.example.udiploma.BottomShoot;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.udiploma.Model.Department;
import com.example.udiploma.Model.InstituteDetails;
import com.example.udiploma.R;
import com.example.udiploma.ViewHolder.DepartmentViewHolder;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class InstituteDetailsFragment extends BottomSheetDialogFragment {

    public InstituteDetailsFragment() {
        // Required empty public constructor
    }
    private String institute_id;
    private List<Department> barisal_dept, patuakhali_dept, bhola_dept,
            chittagong_dept, sweden_dept, chittagong_mohila_dept, coxs_baxar_dept, comilla_dept, survey_dept, feni_dept, feni_computer_dept, lakshmipur_dept, chandpur_dept, brahmanbaria_dept,
            dhaka_dept, dhaka_mohila_dept, tangail_dept, norshingdhi_dept, munsigong_dept, kishoregong_dept, gopalgong_dept, sherpur_dept, glass_dept, graphics_dept, foridpur_dept,
            khulna_dept, khulna_mohila_dept, jessore_dept, kushtia_dept, satkhira_dept, jhenaidah_dept, magura_dept,
            mymensing_dept, shariatpur_dept,
            rajshahi_dept, rajshahi_mohila_dept, bogra_dept, pabna_dept, naogaon_dept, sirajgonj_dept, chapainawabgonj_dept,
            rangpur_dept, dinajpur_dept, kurigram_dept, thakurgaon_dept,
            sylhet_dept, habiganj_dept, maulvi_bazar_dept, borguna_dept, vtti_dept;

    private List<InstituteDetails> barisal,patuakhali, bhola,
            chittagong, sweden, chittagong_mohila, coxs_baxar, comilla, survey, feni, feni_computer, lakshmipur, chandpur, brahmanbaria,
            dhaka, dhaka_mohila, tangail, norshingdhi, munsigong, kishoregong, gopalgong, sherpur, glass, graphics, foridpur,
            khulna, khulna_mohila, jessore, kushtia, satkhira, jhenaidah, magura,
            mymensing, shariatpur,
            rajshahi, rajshahi_mohila, bogra, pabna, naogaon, sirajgonj, chapainawabgonj,
            rangpur, dinajpur, kurigram, thakurgaon,
            sylhet, habiganj, maulvi_bazar, borguna, vtti;
    private RecyclerView department_recycler;

    public TextView institute, fax, email, phone, web, principal, location;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(),R.layout.fragment_institute_details, null);
        dialog.setContentView(view);

        institute_id = getArguments().getString("ins_id").trim();
        Toast.makeText(getContext(), "Institute: "+institute_id, Toast.LENGTH_SHORT).show();

        department_recycler = view.findViewById(R.id.department_sit_recyclerId);
        department_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        institute = view.findViewById(R.id.institute_nameId);
        fax = view.findViewById(R.id.institute_faxId);
        email = view.findViewById(R.id.institute_emailId);
        phone = view.findViewById(R.id.institute_phoneId);
        web = view.findViewById(R.id.institute_webId);
        principal = view.findViewById(R.id.principal_nameId);
        location = view.findViewById(R.id.institute_locationId);

        //depertment_array
        barisal_dept = new ArrayList<>();
        patuakhali_dept = new ArrayList<>();
        bhola_dept = new ArrayList<>();
        chittagong_dept = new ArrayList<>();
        sweden_dept = new ArrayList<>();
        chittagong_mohila_dept = new ArrayList<>();
        coxs_baxar_dept = new ArrayList<>();
        comilla_dept = new ArrayList<>();
        survey_dept = new ArrayList<>();
        feni_dept = new ArrayList<>();
        feni_computer_dept = new ArrayList<>();
        lakshmipur_dept = new ArrayList<>();
        chandpur_dept = new ArrayList<>();
        brahmanbaria_dept = new ArrayList<>();
        dhaka_dept = new ArrayList<>();
        dhaka_mohila_dept = new ArrayList<>();
        tangail_dept = new ArrayList<>();
        norshingdhi_dept = new ArrayList<>();
        munsigong_dept = new ArrayList<>();
        kishoregong_dept = new ArrayList<>();
        gopalgong_dept = new ArrayList<>();
        sherpur_dept = new ArrayList<>();
        glass_dept = new ArrayList<>();
        graphics_dept = new ArrayList<>();
        foridpur_dept = new ArrayList<>();
        khulna_dept = new ArrayList<>();
        khulna_mohila_dept = new ArrayList<>();
        jessore_dept = new ArrayList<>();
        kushtia_dept = new ArrayList<>();
        satkhira_dept = new ArrayList<>();
        jhenaidah_dept = new ArrayList<>();
        magura_dept = new ArrayList<>();
        mymensing_dept = new ArrayList<>();
        shariatpur_dept = new ArrayList<>();
        rajshahi_dept = new ArrayList<>();
        rajshahi_mohila_dept = new ArrayList<>();
        bogra_dept = new ArrayList<>();
        pabna_dept = new ArrayList<>();
        naogaon_dept = new ArrayList<>();
        sirajgonj_dept = new ArrayList<>();
        chapainawabgonj_dept = new ArrayList<>();
        rangpur_dept = new ArrayList<>();
        dinajpur_dept = new ArrayList<>();
        kurigram_dept = new ArrayList<>();
        thakurgaon_dept = new ArrayList<>();
        sylhet_dept = new ArrayList<>();
        habiganj_dept = new ArrayList<>();
        maulvi_bazar_dept = new ArrayList<>();
        borguna_dept = new ArrayList<>();
        vtti_dept = new ArrayList<>();

        //add data depertment_array
        barisal_dept.add(new Department("সিভিল","১৮০"));
        barisal_dept.add(new Department("মেকানিক্যাল","১২০"));
        barisal_dept.add(new Department("পাওয়ার","১২০"));
        barisal_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        barisal_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        barisal_dept.add(new Department("কম্পিউটার","১২০"));
        barisal_dept.add(new Department("ইলেকট্রোমেডিক্যাল","১২০"));

        patuakhali_dept.add(new Department("সিভিল","১২০"));
        patuakhali_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        patuakhali_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        patuakhali_dept.add(new Department("কম্পিউটার","৬০"));
        patuakhali_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));

        bhola_dept.add(new Department("কম্পিউটার","৬০"));
        bhola_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        bhola_dept.add(new Department("সিভিল","১২০"));
        bhola_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));

        borguna_dept.add(new Department("রকম্পিউটার","১২০"));
        borguna_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        borguna_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        borguna_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        borguna_dept.add(new Department("সিভিল","৬০"));

        vtti_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));
        vtti_dept.add(new Department("মেকানিক্যাল","৬০"));
        vtti_dept.add(new Department("রেফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        vtti_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        vtti_dept.add(new Department("কম্পিউটার","৬০"));
        vtti_dept.add(new Department("অটোমোবাইল","৬০"));

        chittagong_dept.add(new Department("সিভিল","১২০"));
        chittagong_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        chittagong_dept.add(new Department("কম্পিউটার","১২০"));
        chittagong_dept.add(new Department("পাওয়ার","১২০"));
        chittagong_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        chittagong_dept.add(new Department("মেকানিক্যাল","১২০"));
        chittagong_dept.add(new Department("এনভায়রনমেন্টাল","১২০"));

        sweden_dept.add(new Department("সিভিল (উড)","৬০"));
        sweden_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));
        sweden_dept.add(new Department("কম্পিউটার","৬০"));
        sweden_dept.add(new Department("মেকানিক্যাল","৬০"));
        sweden_dept.add(new Department("কনষ্ট্রাকশন","৬০"));
        sweden_dept.add(new Department("অটোমোবাইল","৬০"));

        chittagong_mohila_dept.add(new Department("গার্মেন্টস ডিজাইন এন্ড প্যার্টান মেকিং","৬০"));
        chittagong_mohila_dept.add(new Department("কম্পিউটার","৬০"));
        chittagong_mohila_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","৬০"));
        chittagong_mohila_dept.add(new Department("ইলেকট্রনিক্স","৬০"));

        coxs_baxar_dept.add(new Department("কম্পিউটার","৬০"));
        coxs_baxar_dept.add(new Department("সিভিল","৬০"));
        coxs_baxar_dept.add(new Department("ফূড","১২০"));
        coxs_baxar_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","৬০"));

        comilla_dept.add(new Department("সিভিল","১২০"));
        comilla_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        comilla_dept.add(new Department("কম্পিউটার","১২০"));
        comilla_dept.add(new Department("পাওয়ার","৬০"));
        comilla_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        comilla_dept.add(new Department("মেকানিক্যাল","১২০"));

        survey_dept.add(new Department("সার্ভে","১২০"));

        feni_dept.add(new Department("সিভিল","১২০"));
        feni_dept.add(new Department("মেকানিক্যাল","১২০"));
        feni_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        feni_dept.add(new Department("পাওয়ার","৬০"));
        feni_dept.add(new Department("কম্পিউটার","১২০"));
        feni_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","৬০"));

        feni_computer_dept.add(new Department("কম্পিউটার সায়েন্স এন্ড টেকনোলজি","৬০"));
        feni_computer_dept.add(new Department("ডাটা টেলিকমিউনিকেশন এন্ড নেটওয়ার্কিং","৬০"));
        feni_computer_dept.add(new Department("টেলিকমিউনিকেশন","৬০"));

        lakshmipur_dept.add(new Department("কম্পিউটার","৬০"));
        lakshmipur_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        lakshmipur_dept.add(new Department("সিভিল","১২০"));
        lakshmipur_dept.add(new Department("আর্কিটেকচার এন্ড ইন্টেরিয়র ডিজাইন","৬০"));
        lakshmipur_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));

        chandpur_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        chandpur_dept.add(new Department("কম্পিউটার","৬০"));
        chandpur_dept.add(new Department("কন্সট্রাকশন","১২০"));
        chandpur_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        chandpur_dept.add(new Department("সিভিল","৬০"));

        brahmanbaria_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং ","৬০"));
        brahmanbaria_dept.add(new Department("কম্পিউটার","১২০"));
        brahmanbaria_dept.add(new Department("আর্কিটেকচার এন্ড ইন্টেরিয়র ডিজাইন","৬০"));
        brahmanbaria_dept.add(new Department("ইলেকট্রমেডিক্যাল","৬০"));

        dhaka_dept.add(new Department("সিভিল","২৪০"));
        dhaka_dept.add(new Department("ইলেকট্রিক্যাল","১৮০"));
        dhaka_dept.add(new Department("মেকানিক্যাল","১৮০"));
        dhaka_dept.add(new Department("অটোমোবাইল","১২০"));
        dhaka_dept.add(new Department("ফুড","১২০"));
        dhaka_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        dhaka_dept.add(new Department("কম্পিউটার","১২০"));
        dhaka_dept.add(new Department("আর্কিটেকটার","১২০"));
        dhaka_dept.add(new Department("কেমিক্যাল","১২০"));
        dhaka_dept.add(new Department("রেফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","১২০"));
        dhaka_dept.add(new Department("ইলেকট্রনিক্স","১২০"));

        dhaka_mohila_dept.add(new Department("আর্কিটেকচার","১২০"));
        dhaka_mohila_dept.add(new Department("কম্পিউটার","৬০"));
        dhaka_mohila_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        dhaka_mohila_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));
        dhaka_mohila_dept.add(new Department("ইন্সট্রুমেন্টেশন এন্ড প্রসেস কন্ট্রোল","৬০"));

        tangail_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        tangail_dept.add(new Department("কনষ্ট্রাকশন","৬০"));
        tangail_dept.add(new Department("টেলিকমিউনিকেশন","১২০"));
        tangail_dept.add(new Department("কম্পিউটার","১২০"));
        tangail_dept.add(new Department("ইলেকট্রনিক্স","১২০"));

        norshingdhi_dept.add(new Department("কম্পিউটার","৬০"));
        norshingdhi_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        norshingdhi_dept.add(new Department("সিভিল","১২০"));
        norshingdhi_dept.add(new Department("ফুড","৬০"));
        norshingdhi_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));

        munsigong_dept.add(new Department("কম্পিউটার","১২০"));
        munsigong_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        munsigong_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));
        munsigong_dept.add(new Department("ইন্সট্রুমেন্টেশন এন্ড প্রসেস কন্ট্রোল","৬০"));
        munsigong_dept.add(new Department("সিভিল","৬০"));
        munsigong_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));
        munsigong_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","৬০"));
        munsigong_dept.add(new Department("মেকানিক্যাল","৬০"));

        kishoregong_dept.add(new Department("কম্পিউটার","১২০"));
        kishoregong_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","১২০"));
        kishoregong_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        kishoregong_dept.add(new Department("ফুড","১২০"));

        gopalgong_dept.add(new Department("কম্পিউটার","৬০"));
        gopalgong_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        gopalgong_dept.add(new Department("ফূড","৬০"));
        gopalgong_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","৬০"));
        gopalgong_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));

        sherpur_dept.add(new Department("কম্পিউটার","৬০"));
        sherpur_dept.add(new Department("সিভিল","৬০"));
        sherpur_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        sherpur_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        sherpur_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));

        glass_dept.add(new Department("সিরামিক","১৮০"));
        glass_dept.add(new Department("গ্লাস","৬০"));

        graphics_dept.add(new Department("গ্রাফিক ডিজাইন","১২০"));
        graphics_dept.add(new Department("প্রিন্টিং","৬০"));
        graphics_dept.add(new Department("কম্পিউটার","৬০"));

        foridpur_dept.add(new Department("সিভিল","১২০"));
        foridpur_dept.add(new Department("মেকানিক্যাল","১২০"));
        foridpur_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        foridpur_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","১২০"));
        foridpur_dept.add(new Department("পাওয়ার","১২০"));
        foridpur_dept.add(new Department("কম্পিউটার","১২০"));

        khulna_dept.add(new Department("সিভিল","১২০"));
        khulna_dept.add(new Department("মেকানিক্যাল","১২০"));
        khulna_dept.add(new Department("পাওয়ার","৬০"));
        khulna_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        khulna_dept.add(new Department("কম্পিউটার","৬০"));
        khulna_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        khulna_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        khulna_dept.add(new Department("ইন্সট্রুমেন্টেশন এন্ড প্রসেস কন্ট্রোল","৬০"));

        khulna_mohila_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","১২০"));
        khulna_mohila_dept.add(new Department("কম্পিউটার","১২০"));
        khulna_mohila_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        khulna_mohila_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        khulna_mohila_dept.add(new Department("সিভিল","৬০"));

        jessore_dept.add(new Department("সিভিল","১২০"));
        jessore_dept.add(new Department("মেকানিক্যাল","১২০"));
        jessore_dept.add(new Department("পাওয়ার","১২০"));
        jessore_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        jessore_dept.add(new Department("কম্পিউটার","১২০"));
        jessore_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        jessore_dept.add(new Department("টেলিকমিউনিকেশন","৬০"));

        kushtia_dept.add(new Department("সিভিল","১২০"));
        kushtia_dept.add(new Department("মেকানিক্যাল","৬০"));
        kushtia_dept.add(new Department("পাওয়ার","৬০"));
        kushtia_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        kushtia_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        kushtia_dept.add(new Department("কম্পিউটার","৬০"));

        satkhira_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        satkhira_dept.add(new Department("কম্পিউটার","৬০"));
        satkhira_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        satkhira_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        satkhira_dept.add(new Department("সিভিল","৬০"));

        jhenaidah_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        jhenaidah_dept.add(new Department("সিভিল","৬০"));
        jhenaidah_dept.add(new Department("কম্পিউটার","৬০"));
        jhenaidah_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        jhenaidah_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));

        magura_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","১২০"));
        magura_dept.add(new Department("মেকাট্রনিক্স","১২০"));
        magura_dept.add(new Department("কম্পিউটার","১২০"));
        magura_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        magura_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        magura_dept.add(new Department("ফুড","১২০"));

        mymensing_dept.add(new Department("সিভিল","১৮০"));
        mymensing_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        mymensing_dept.add(new Department("ইলেকট্রিক্যাল","১৮০"));
        mymensing_dept.add(new Department("কম্পিউটার","১২০"));
        mymensing_dept.add(new Department("পাওয়ার","১২০"));
        mymensing_dept.add(new Department("মেকানিক্যাল","১২০"));
        mymensing_dept.add(new Department("ইলেকট্রোমেডিক্যাল","১২০"));

        shariatpur_dept.add(new Department("ইন্সট্রুমেন্টেশন এন্ড প্রসেস কন্ট্রোল","৬০"));
        shariatpur_dept.add(new Department("টেলিকমিউনিকেশন","৬০"));
        shariatpur_dept.add(new Department("কম্পিউটার","১২০"));
        shariatpur_dept.add(new Department("ইলেকট্রনিক্স","৬০"));

        rajshahi_dept.add(new Department("সিভিল","১২০"));
        rajshahi_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        rajshahi_dept.add(new Department("কম্পিউটার","৬০"));
        rajshahi_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));
        rajshahi_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        rajshahi_dept.add(new Department("পাওয়ার","৬০"));
        rajshahi_dept.add(new Department("মেকানিক্যাল","১২০"));
        rajshahi_dept.add(new Department("মেকাট্রনিক্স","৬০"));

        rajshahi_mohila_dept.add(new Department("আর্কিটেকচার এন্ড ইন্টেরিয়র ডিজাইন","৬০"));
        rajshahi_mohila_dept.add(new Department("কম্পিউটার","৬০"));
        rajshahi_mohila_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));
        rajshahi_mohila_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        rajshahi_mohila_dept.add(new Department("ফুড","৬০"));

        bogra_dept.add(new Department("সিভিল","১২০"));
        bogra_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        bogra_dept.add(new Department("কম্পিউটার","৬০"));
        bogra_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        bogra_dept.add(new Department("পাওয়ার","৬০"));
        bogra_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        bogra_dept.add(new Department("মেকানিক্যাল","১২০"));
        bogra_dept.add(new Department("মাইনিং এন্ড মাইন সার্ভে","৬০"));

        pabna_dept.add(new Department("সিভিল","১৮০"));
        pabna_dept.add(new Department("পাওয়ার","১২০"));
        pabna_dept.add(new Department("এনভায়নমেন্টাল","১২০"));
        pabna_dept.add(new Department("মেকানিক্যাল","১২০"));
        pabna_dept.add(new Department("কম্পিউটার","১২০"));
        pabna_dept.add(new Department("কনষ্ট্রাকশন","১২০"));
        pabna_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        pabna_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        pabna_dept.add(new Department("ইলেকট্রনিক্স","৬০"));

        naogaon_dept.add(new Department("কম্পিউটার","৬০"));
        naogaon_dept.add(new Department("ফুড","৬০"));
        naogaon_dept.add(new Department("আর্কিটেকচার এন্ড ইন্টেরিয়র ডিজাইন","৬০"));
        naogaon_dept.add(new Department("এনভায়রনমেন্টাল","৬০"));
        naogaon_dept.add(new Department("সিভিল","৬০"));

        sirajgonj_dept.add(new Department("কম্পিউটার","৬০"));
        sirajgonj_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        sirajgonj_dept.add(new Department("সিভিল","১২০"));
        sirajgonj_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        sirajgonj_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));

        chapainawabgonj_dept.add(new Department("কম্পিউটার","১২০"));
        chapainawabgonj_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        chapainawabgonj_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        chapainawabgonj_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","১২০"));
        chapainawabgonj_dept.add(new Department("ফুড","১২০"));
        chapainawabgonj_dept.add(new Department("মেকাট্রনিক্স","১২০"));

        rangpur_dept.add(new Department("সিভিল","১২০"));
        rangpur_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        rangpur_dept.add(new Department("কম্পিউটার","১২০"));
        rangpur_dept.add(new Department("পাওয়ার","১২০"));
        rangpur_dept.add(new Department("মেকানিক্যাল","১২০"));
        rangpur_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));
        rangpur_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));

        dinajpur_dept.add(new Department("সিভিল","১২০"));
        dinajpur_dept.add(new Department("মেকানিক্যাল","১২০"));
        dinajpur_dept.add(new Department("পাওয়ার","১২০"));
        dinajpur_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        dinajpur_dept.add(new Department("কম্পিউটার","১২০"));
        dinajpur_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","৬০"));

        kurigram_dept.add(new Department("কম্পিউটার","১২০"));
        kurigram_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","১২০"));
        kurigram_dept.add(new Department("কন্সট্রাকশন","৬০"));
        kurigram_dept.add(new Department("ইলেকট্রনিক্স","৬০"));
        kurigram_dept.add(new Department("সিভিল","৬০"));
        kurigram_dept.add(new Department("ইলেকট্রিক্যাল","৬০"));
        kurigram_dept.add(new Department("মেকানিক্যাল","৬০"));

        thakurgaon_dept.add(new Department("রিফ্রিজারেশন এন্ড এয়ার কন্ডিশনিং","৬০"));
        thakurgaon_dept.add(new Department("কম্পিউটার","১২০"));
        thakurgaon_dept.add(new Department("আর্কিটেকচার এন্ড ইনটেরিয়র ডিজাইন","৬০"));
        thakurgaon_dept.add(new Department("ফুড","১২০"));
        thakurgaon_dept.add(new Department("মেকাট্রনিকাস","৬০"));

        sylhet_dept.add(new Department("সিভিল","১৮০"));
        sylhet_dept.add(new Department("পাওয়ার","৬০"));
        sylhet_dept.add(new Department("কম্পিউটার","১২০"));
        sylhet_dept.add(new Department("ইলেকট্রিক্যাল","১২০"));
        sylhet_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        sylhet_dept.add(new Department("মেকানিক্যাল","১২০"));
        sylhet_dept.add(new Department("ইলেকট্রোমেডিক্যাল","৬০"));

        habiganj_dept.add(new Department("আর্কিটেকচার এন্ড ইন্টেরিয়র ডিজাইন","৬০"));
        habiganj_dept.add(new Department("কম্পিউটার","১২০"));
        habiganj_dept.add(new Department("সিভিল","৬০"));
        habiganj_dept.add(new Department("ইলেকট্রনিক্স","৬০"));

        maulvi_bazar_dept.add(new Department("কম্পিউটার","১২০"));
        maulvi_bazar_dept.add(new Department("রিফ্রিাজারেশন এন্ড এয়ারকম্ডিশনিং","১২০"));
        maulvi_bazar_dept.add(new Department("ইলেকট্রনিক্স","১২০"));
        maulvi_bazar_dept.add(new Department("ফুড","১২০"));

        //details_array
        barisal = new ArrayList<>();
        patuakhali = new ArrayList<>();
        bhola = new ArrayList<>();
        chittagong = new ArrayList<>();
        sweden = new ArrayList<>();
        chittagong_mohila = new ArrayList<>();
        coxs_baxar = new ArrayList<>();
        comilla = new ArrayList<>();
        survey = new ArrayList<>();
        feni = new ArrayList<>();
        feni_computer = new ArrayList<>();
        lakshmipur = new ArrayList<>();
        chandpur = new ArrayList<>();
        brahmanbaria = new ArrayList<>();
        dhaka = new ArrayList<>();
        dhaka_mohila = new ArrayList<>();
        tangail = new ArrayList<>();
        norshingdhi = new ArrayList<>();
        munsigong = new ArrayList<>();
        kishoregong = new ArrayList<>();
        gopalgong = new ArrayList<>();
        sherpur = new ArrayList<>();
        glass = new ArrayList<>();
        graphics = new ArrayList<>();
        foridpur = new ArrayList<>();
        khulna = new ArrayList<>();
        khulna_mohila = new ArrayList<>();
        jessore = new ArrayList<>();
        kushtia = new ArrayList<>();
        satkhira = new ArrayList<>();
        jhenaidah = new ArrayList<>();
        magura = new ArrayList<>();
        mymensing = new ArrayList<>();
        shariatpur = new ArrayList<>();
        rajshahi = new ArrayList<>();
        rajshahi_mohila = new ArrayList<>();
        bogra = new ArrayList<>();
        pabna = new ArrayList<>();
        naogaon = new ArrayList<>();
        sirajgonj = new ArrayList<>();
        chapainawabgonj = new ArrayList<>();
        rangpur = new ArrayList<>();
        dinajpur = new ArrayList<>();
        kurigram = new ArrayList<>();
        thakurgaon = new ArrayList<>();
        sylhet = new ArrayList<>();
        habiganj = new ArrayList<>();
        maulvi_bazar = new ArrayList<>();
        borguna = new ArrayList<>();
        vtti = new ArrayList<>();

        // add data details_array
        barisal.add(new InstituteDetails("Md. Ruhul Amin" ,
                "Barishal Polytechnic Institute" ,
                "88-043164684",
                "01911227578" ,
                "barisal.poly@gmail.com" ,
                "bpi.edu.bd",
                "Alekanda, Barishal"));
        patuakhali.add(new InstituteDetails("Hasan Mohammad Kamruzzaman",
                "Patuakhali Polytechnic Institute" ,
                "88-0441-62354" ,
                "01727456210",
                "principalppi@yahoo.com" ,
                "ppi.gov.bd" ,
                "Patuakhali"));
        bhola.add(new InstituteDetails("Engr. MD. Tajul Islam (in-charge)",
                "Bhola Polytechnic Institute" ,
                "88-04922-56375",
                "01714558001",
                "bhpi_2005@yahoo.com",
                "bhpi.edu.bd",
                "Bhola Highsway Road, Bhola"));
        chittagong.add(new InstituteDetails("Abdur Rahman","Chittagong Polytechnic Institute",
                "88-03162534","01711452480","polytechnicctg@yahoo.com","ctgpoly.gov.bd","Nasirbad, Chittagong"));
        sweden.add(new InstituteDetails("Engr. Ashutosh Nath",
                "Bangladesh Sweden Polytechnic Institute",
                "88-03529-56251",
                "01815666463",
                "principal.bspi@yahoo.com",
                "bspi.gov.bd",
                "Kaptai, Rangamati"));
        chittagong_mohila.add(new InstituteDetails("Sunil Chandra Chowdhury",
                "Chittagong Mohila Polytechnic Institute",
                "88-031-2512074",
                "01918029919" ,
                "cmpi10@yahoo.com" ,
                "cmpi.gov.bd" ,
                "Port Link Road, Chittagong"));
        coxs_baxar.add(new InstituteDetails("Pradiptho Khisa (in-charge)" ,
                "Cox's Bazar Polytechnic Institute",
                "88-0341-63388" ,
                "01715747546" ,
                "coxpoly@gmail.com" ,
                "Coxpoly.gov.bd" ,
                "Linkrod, Cox'sbazar"));
        comilla.add(new InstituteDetails("Mohammad Rihan Uddin (in-charge)",
                "Comilla Polytechnic Institute",
                "88-081-76077" ,
                "01971333888",
                "comillapoly65054@yahoo.com",
                "comillapoly.gov.bd",
                "Kotbari, Comilla"));
        survey.add(new InstituteDetails("Md. Kepayet Ullah" ,
                "Bangladesh Survey Institute\n",
                "88-081-68477\n",
                "01819181608\n" ,
                "bsi65056@gmail.com\n" ,
                "bsiedu.gov.bd\n" , ""));
        feni.add(new InstituteDetails("Md Mostafizur Rahman Khan",
                "Feni Polytechnic Institute" ,
                "88-033174030",
                "019362112606" ,
                "fenipoly69015@yahoo.com",
                "fenipoly.edu.bd",
                "Malipur, Feni"));
        feni_computer.add(new InstituteDetails("Md. Rakib Ullah (in-charge)",
                "Feni Computer Institute" ,
                "88-0331-61888" ,
                "01912384469",
                "fci_bd@yahoo.com",
                "fci.gov.bd" ,
                "Ranir Hat, Feni"));
        lakshmipur.add(new InstituteDetails("Engr. Mohammad Alauddin (in-charge)" ,
                "Lakshmipur Polytechnic Institute" ,
                "88-0381-61022" ,
                "01712029381" ,
                "laxmipur_polytechnic@yahoo.com",
                "lpi.gov.bd",
                "Laxmipur"));
        chandpur.add(new InstituteDetails("Md. Lutfar Rahman",
                "Chandpur Polytechnic Institute" ,
                "88-08425-56205" ,
                "01711186082" ,
                "principalcpi@gmail.com" ,
                "cpi.edu.bd" ,
                "Kachua Upazila, Chandpur"));
        brahmanbaria.add(new InstituteDetails("Md. Abul Kalam Azad (in-charge)",
                "Brahmanbaria Polytechnic Institute",
                "88-08327-56151",
                "019246022837",
                "bbariapoly@yahoo.com" ,
                "bbpi.gov.bd" ,
                "Islampur, Brahmanbaria"));
        dhaka.add(new InstituteDetails("Kazi Zakir Hossain" ,
                "Dhaka Polytechnic Institute" ,
                "88-02-9116724" ,
                "01992006465" ,
                "principal.dpi54@yahoo.com" ,
                "dpi.gov.bd" ,
                "Tejgaow Shilpo Alaka D-1208"));
        dhaka_mohila.add(new InstituteDetails("Sahana Begum (in-charge)",
                "Dhaka Mohila Polytechnic Institute" ,
                "88-02-9114013",
                "01714204624",
                "dhakampi@gmail.com",
                "dmpi.gov.bd",
                "Agargaow, Dhaka-1207"));
        tangail.add(new InstituteDetails("Syed Farrukh Ahmad" ,
                "Tangail Polytechnic Institute" ,
                "88-0921-63237",
                "01715133708" ,
                "tangpoly1991@gmail.com" ,
                "tpi.gov.bd" ,
                "Deowla, Tangail"));
        norshingdhi.add(new InstituteDetails("Md. Farhad Hossain Chowdhury",
                "Norshingdhi Polytechnic Institute",
                "88-0628-51662",
                "01712093697",
                "nrspoly@gmail.com",
                "narpoly.gov.bd",
                "Norshingdhi"));
        munsigong.add(new InstituteDetails("Md Mizanur Rahman (in-charge)",
                "Munsigong Polytechnic Institute",
                "88-02-76122825" ,
                "01875091001",
                "mpiprincipal@gmail.com",
                "munpoly.gov.bd",
                "Mirkadim, Munsigong"));
        kishoregong.add(new InstituteDetails("Engr. MD. Monir Uddin" ,
                "Kishoregong Polytechnic Institute",
                "",
                "01721319175" ,
                "kishorepoly08@gmail.com" ,
                "kpi.gov.bd",
                "Kishoregong"));
        gopalgong.add(new InstituteDetails("Md. Mainul Ahsan (in-charge)",
                "Gopalgong Polytechnic Institute",
                "88-0668-58015",
                "01712837077",
                "principal.gopalgong@yahoo.com",
                "",
                "Chandradighalia, 8013"));
        sherpur.add(new InstituteDetails("Engr. Shakawat Hossen" ,
                "Sherpur Polytechnic Institute",
                "88-0931-62534" ,
                "01711193503",
                "rincipalspi@hotmail.com",
                "sherpurpoly.edu.bd",
                "Vatshala, Sherpur"));
        glass.add(new InstituteDetails("MD. Ayoub Ali" ,
                "Bangladesh Institute Of Glass And Survey" ,
                "88-02-9110319",
                "017163237252",
                "principal.bigc@yahoo.com" ,
                "bigc.gov.bd" ,
                "Tejgaow Shilpo Alaka D-1208"));
        graphics.add(new InstituteDetails("Nihar Ranjan Das (in-charge)" ,
                "Graphics Arts Institute" ,
                "88-02-9113896" ,
                "01817046134" ,
                "principal.graphics@gmail.com" ,
                "gai.gov.bd" ,
                "Satmosjid Road mohammadpur "));
        foridpur.add(new InstituteDetails("Md. Aktaruzzaman" ,
                "Foridpur Polytechnic Institute" ,
                "88-0631-63598" ,
                "01714073726" ,
                "fpi.poly@gmail.com" ,
                "faridpurpolytechnic.gov.bd",
                "Baytul aman Foridpur"));
        khulna.add(new InstituteDetails("Onimesh Pal (in-charge)",
                "Khulna Polytechnic Institute",
                "88-041-762352" ,
                "01710900011" ,
                "kpiprincipal@gmail.com",
                "kpi.edu.bd" ,
                "Khalishpur, Khulna"));
        khulna_mohila.add(new InstituteDetails("Kaji Neamul Shahin (in-charge)",
                "Khulna Mohila Polytechnic Institute" ,
                "88-0412-850092",
                "01712228682",
                "kmpi.edu@gmail.com",
                "kmpi.gov.bd" ,
                "Khulna"));
        jessore.add(new InstituteDetails("GM Azizur Rahman",
                "Jessore Polytechnic Institute",
                "88-0421-68536",
                "01711940279" ,
                "principal@jpi.edu.bd",
                "jpi.edu.bd",
                "Shikkha Board, Kotoali, Jessore"));
        kushtia.add(new InstituteDetails("Mohammad Mosharraf Hossain (in-charge)",
                "Kushtia Polytechnic Institute",
                "88-071-62066",
                "01733544142",
                "kpiprincipal.27040@gmail.com",
                "kushtiapi.gov.bd",
                "M.M Hossain Road, Kushtia"));
        satkhira.add(new InstituteDetails("Md. Maksudur Rahman",
                "Satkhira Polytechnic Institute",
                "88-0471-65170",
                "01911764106",
                "satpoly2010@gmail.com",
                "satkhirapoly.gov.bd",
                "Kalaroa Road, Satkhira"));
        jhenaidah.add(new InstituteDetails("Md. Maksudur Rahman (in-charge)",
                "Jhenaidah Polytechnic Institute",
                "88-0451-61385",
                "01911764106" ,
                "jhenaidahpoly@gmail.com" ,
                "jhenaidahpoly.gov.bd" ,
                "Jhenaidah"));
        magura.add(new InstituteDetails("MD. Munir Hossen (in-charge)",
                "Magura Polytechnic Institute" ,
                "88-0488-63655",
                "01556304682" ,
                "principalmpi2011@gmail.com" ,
                "magurapoly.gov.bd",
                "Magura"));

        mymensing.add(new InstituteDetails("Dr. Md. Morad Hossain Mollah" ,
                "Mymensingh Polytechic Institute",
                "88-09167294",
                "0155636153",
                "principal.mpi@gmail.com",
                "mpi.edu.bd" ,
                "Mymensingh"));

        shariatpur.add(new InstituteDetails("Aktharuzzaman Talukder" ,
                "Shariatpur Polytechnic Institute" ,
                "88-0601-61455",
                "01711213630",
                "shariatpurpoly@yaho0.com",
                "shariatpurpolytechnic.gov.bd",
                "Burir hat, Shariatpur"));
        rajshahi.add(new InstituteDetails("Farid Uddin Ahmed" ,
                "Rajshahi Polytechnic Institute" ,
                "88-0721-761977",
                "01917292557" ,
                "rajpolytech@gmail.com" ,
                "rpi.gov.bd",
                "Rajshahi-naogaon Highway Rajshahi"));
        rajshahi_mohila.add(new InstituteDetails("Abdul Matin Hawlader (in-charge)" ,
                "Rajshahi Mohila Polytechnic Institute" ,
                "0187275761" ,
                "01711387068",
                "faruk.rmpi@gmail.com" ,
                "rmpi.gov.bd" ,
                "Bypas, Rajshahi"));
        bogra.add(new InstituteDetails("Md. Shahadat Hossain" ,
                "Bogra Polytechnic Institute" ,
                "88-051-66152" ,
                "01715360652" ,
                "bogra_poly@yahoo.com" ,
                "bograpoly.gov.bd" ,
                "Sherpur Road, Bogra"));
        pabna.add(new InstituteDetails("Md. Atiqur Rahman" ,
                "Pabna Polytechnic Institute" ,
                "88-0731-65844" ,
                "01818255069" ,
                "Ppiprincipal@yahoo.com" ,
                "Ppi.pabna.gov.bd" ,
                "Polytechnic Road, Pabna"));
        naogaon.add(new InstituteDetails("MD. Fazlul Haque" ,
                "Naogaon Polytechnic Institute",
                "88-0741-62070" ,
                "01915566804" ,
                "npi21064@gmail.com" ,
                "npi.gov.bd" ,
                "Doubelhati Road, Naogaon"));
        sirajgonj.add(new InstituteDetails("Abdul Hannan Khan",
                "Sirajgonj Polytechnic Institute" ,
                "88-0751-64286" ,
                "01558398246" ,
                "principal.spi@gmail.com" ,
                "spisg.gov.bd" ,
                "Kazipur Road, Sirajgonj"));
        chapainawabgonj.add(new InstituteDetails("Humayun Kabir Khan",
                "Chapainawabgonj Polytechnic Institute","88-0781-51771",
                "chapaipoly@yahoo.com","01911328640","cnpi.gov.bd","Chapainawabgonj"));
        rangpur.add(new InstituteDetails("Mohammad Khaled Hossain",
                "Rangpur Polytechnic Institute",
                "88-0521-83513",
                "01716223829",
                "rpi_5400@yahoo.com" ,
                "rpir.gov.bd" ,
                "Shalbon Mistry Para Road, Rangpur"));
        dinajpur.add(new InstituteDetails("Md. Abdul Wadud Mondal (in-charge)",
                "Dinajpur Polytechnic Institute",
                "88-0631-65573",
                "01740564521",
                "dpi_dinajpur@yahoo.com",
                "dpi.edu.bd",
                "Balubari, Dinajpur"));
        kurigram.add(new InstituteDetails("MD. Nure Alom" ,
                "Kurigram Polytechnic Institute" ,
                "88-0851-61688",
                "01992013340",
                "principal@kpik.gov.bd" ,
                "kpik.gov.bd" ,
                "Central Jail Road, Kurigram"));
        thakurgaon.add(new InstituteDetails("Md. Ali Akbar Khan" ,
                "Thakurgaon Polytechnic Institute" ,
                "88-0561-61400" ,
                "015500028846",
                "principal@tpi.edu.bd" ,
                "tpi.edu.bd" ,
                "Baliadangi Road, Thakurgaon"));
        sylhet.add(new InstituteDetails("Dr. Mohammad Abdullah" ,
                "Shylet Polytechnic Institute" ,
                "88-0821-716372",
                "01718538327" ,
                "principalsylhetpoly@gmail.com" ,
                "spi.gov.bd" ,
                "Shylet"));
        habiganj.add(new InstituteDetails("Mohsinur Rahman (in-charge)" ,
                "Hobiganj Polytechnic Institute",
                "88-0831-62320" ,
                "01816500544" ,
                "principal.hpi@gmail.com",
                "hpi.gov.bd",
                "Hobigonj"));
        maulvi_bazar.add(new InstituteDetails("Md. Reduanur Rahman (in-charge)",
                "Moulvibazar Polytechnic Institute",
                "",
                "01819144515",
                "moulvibazarpolytechnic@gmail.com" ,
                "mbpi.gov.bd" ,
                "Shomshernagar Road,"));
        borguna.add(new InstituteDetails("Mohammad Anwarul kabir (in-charge)",
                "Barguna Polytechnic Institute",
                "88-0446-63460",
                "01819144515",
                "prin.barguna@gmail.com" ,
                "bargunapoly.gov.bd" ,
                "Barguna"));
        vtti.add(new InstituteDetails("Md. Reduanur Rahman (in-charge)",
                "Vocational Teacher's Training Institute, Bogura",
                "",
                "051-65624",
                "vtti_bogra@yahoo.com" ,
                "mbpi.gov.bd" ,
                "Sherpur Rd, Bogura"));


        switch (institute_id)
        {
            case "barishal":
                setDetails(barisal);
                setDepartment(barisal_dept);
                break;
            case "patuakhali":
                setDetails(patuakhali);
                setDepartment(patuakhali_dept);
                break;
            case "bhola":
                setDetails(bhola);
                setDepartment(bhola_dept);
                break;
            case "barguna":
                setDetails(borguna);
                setDepartment(borguna_dept);
                break;
            case "ctg":
                setDetails(chittagong);
                setDepartment(chittagong_dept);
                break;
            case "sweden":
                setDetails(sweden);
                setDepartment(sweden_dept);
                break;
            case "ctg_mohila":
                setDetails(chittagong_mohila);
                setDepartment(chittagong_mohila_dept);
                break;
            case "Coxpoly":
                setDetails(coxs_baxar);
                setDepartment(coxs_baxar_dept);
                break;
            case "comilla":
                setDetails(comilla);
                setDepartment(comilla_dept);
                break;
            case "survey":
                setDetails(survey);
                setDepartment(sweden_dept);
                break;
            case "fenipoly":
                setDetails(feni);
                setDepartment(feni_dept);
                break;
            case "feni_computer":
                setDetails(feni_computer);
                setDepartment(feni_computer_dept);
                break;
            case "lakshmipur":
                setDetails(lakshmipur);
                setDepartment(lakshmipur_dept);
                break;
            case "chandpur":
                setDetails(chandpur);
                setDepartment(chandpur_dept);
                break;
            case "brahmanbaria":
                setDetails(brahmanbaria);
                setDepartment(brahmanbaria_dept);
                break;
            case "dhaka":
                setDetails(dhaka);
                setDepartment(dhaka_dept);
                break;
            case "dhaka_mohila":
                setDetails(dhaka_mohila);
                setDepartment(dhaka_mohila_dept);
                break;
            case "tangail":
                setDetails(tangail);
                setDepartment(tangail_dept);
                break;
            case "norshingdhi":
                setDetails(norshingdhi);
                setDepartment(norshingdhi_dept);
                break;
            case "munshigong":
                setDetails(munsigong);
                setDepartment(munsigong_dept);
                break;
            case "kishoregong":
                setDetails(kishoregong);
                setDepartment(kishoregong_dept);
                break;
            case "gopalgong":
                setDetails(gopalgong);
                setDepartment(gopalgong_dept);
                break;
            case "sherpur":
                setDetails(sherpur);
                setDepartment(sherpur_dept);
                break;
            case "glass":
                setDetails(glass);
                setDepartment(glass_dept);
                break;
            case "graphics":
                setDetails(graphics);
                setDepartment(graphics_dept);
                break;
            case "foridpur":
                setDetails(foridpur);
                setDepartment(foridpur_dept);
                break;
            case "khulna":
                setDetails(khulna);
                setDepartment(khulna_dept);
                break;
            case "khulna_mohila":
                setDetails(khulna_mohila);
                setDepartment(khulna_mohila_dept);
                break;
            case "jessore":
                setDetails(jessore);
                setDepartment(jessore_dept);
                break;
            case "kushtia":
                setDetails(kushtia);
                setDepartment(kushtia_dept);
                break;
            case "satkhira":
                setDetails(satkhira);
                setDepartment(satkhira_dept);
                break;
            case "jhenaidah":
                setDetails(jhenaidah);
                setDepartment(jhenaidah_dept);
                break;
            case "magura":
                setDetails(magura);
                setDepartment(magura_dept);
                break;
            case "mymensingh":
                setDetails(mymensing);
                setDepartment(mymensing_dept);
                break;
            case "shariatpur":
                setDetails(shariatpur);
                setDepartment(shariatpur_dept);
                break;
            case "rajshahi":
                setDetails(rajshahi);
                setDepartment(rajshahi_dept);
                break;
            case "rajshahi_mohila":
                setDetails(rajshahi_mohila);
                setDepartment(rajshahi_mohila_dept);
                break;
            case "bogra":
                setDetails(bogra);
                setDepartment(bogra_dept);
                break;
            case "vtti":
                setDetails(vtti);
                setDepartment(vtti_dept);
                break;
            case "pabna":
                setDetails(pabna);
                setDepartment(pabna_dept);
                break;
            case "naogaon":
                setDetails(naogaon);
                setDepartment(naogaon_dept);
                break;
            case "sirajgonj":
                setDetails(sirajgonj);
                setDepartment(sirajgonj_dept);
                break;
            case "chapai":
                setDetails(chapainawabgonj);
                setDepartment(chapainawabgonj_dept);
                break;
            case "rangpur":
                setDetails(rangpur);
                setDepartment(rajshahi_dept);
                break;
            case "dinajpur":
                setDetails(dinajpur);
                setDepartment(dinajpur_dept);
                break;
            case "kurigram":
                setDetails(kurigram);
                setDepartment(kurigram_dept);
                break;
            case "thakurgaon":
                setDetails(thakurgaon);
                setDepartment(thakurgaon_dept);
                break;
            case "sylhet":
                setDetails(sylhet);
                setDepartment(sylhet_dept);
                break;
            case "habiganj":
                setDetails(habiganj);
                setDepartment(habiganj_dept);
                break;
            case "maulvi_bazar":
                setDetails(maulvi_bazar);
                setDepartment(maulvi_bazar_dept);
                break;
        }

        return dialog;
    }

    private void setDepartment(final List<Department> id_dept) {
        RecyclerView.Adapter<DepartmentViewHolder> adapter = new RecyclerView.Adapter<DepartmentViewHolder>() {
            @NonNull
            @Override
            public DepartmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.department_seat_item, parent, false);
                DepartmentViewHolder holder = new DepartmentViewHolder(view);
                return holder;
            }

            @Override
            public void onBindViewHolder(@NonNull DepartmentViewHolder holder, int position) {
                holder.department.setText(id_dept.get(position).getDepartment());
                holder.seat.setText(id_dept.get(position).getSeat());
            }

            @Override
            public int getItemCount() {
                return id_dept.size();
            }
        };
        department_recycler.setAdapter(adapter);
    }

    private void setDetails(final List<InstituteDetails> id_ins) {
        for(int i=0; i<id_ins.size(); i++) {
            institute.setText(id_ins.get(i).getPoly());
            principal.setText("Principal: "+id_ins.get(i).getPrincipal());
            fax.setText("Fax: "+id_ins.get(i).getFax());
            email.setText("Email: "+id_ins.get(i).getEmail());
            web.setText("Web: "+id_ins.get(i).getWeb());
            phone.setText("Mobile: "+id_ins.get(i).getMobile());
            location.setText("Location: "+id_ins.get(i).getMobile());
        }
    }
}
