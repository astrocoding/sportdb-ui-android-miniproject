package com.belajar.sportdb;

import java.util.ArrayList;

public class SportData {
    private static String[] sportNames = {
            "Hapoel Holon",
            "Idaho State",
            "Kataja BC",
            "Kennesaw State",
            "KK Koper Primorska",
            "Loyola-Chicago",
            "New York Liberty",
            "Old Dominion",
            "KB Peja",
            "BC Prievidza",
            "Shiga",
            "Northern Colorado (UNC)"
    };

    private static String[] sportDetails = {
            "Available in : USA\n" +
                    "Established : 1947 (75 tahun)\n" +
                    "Stadium : Holon Toto Hall",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : Holt Arena",
            "Available in : USA\n" +
                    "Established : 1949 (73 tahun)\n" +
                    "Stadium : Joensuu Areena",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : KSU Convocation Center",
            "Available in : USA\n" +
                    "Established : 2016 (6 tahun)\n" +
                    "Stadium : Arena Bonifika",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : Joseph J. Gentile Arena",
            "Available in : USA\n" +
                    "Established : 1997 (25 tahun)\n" +
                    "Stadium : Barclays Center",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : Chartway Arena",
            "Available in : USA\n" +
                    "Established : 1993 (29 tahun)\n" +
                    "Stadium : Karagaq Sports Hall",
            "Available in : USA\n" +
                    "Established : 1947 (75 tahun)\n" +
                    "Stadium : Niké Aréna",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : -",
            "Available in : USA\n" +
                    "Established : 2021 (1 tahun)\n" +
                    "Stadium : Bank of Colorado Arena"
    };

    private static String[] sportDesc = {
            "Hapoel Holon, untuk alasan sponsor Hapoel Unet Holon, adalah klub bola basket " +
                    "yang berbasis di Holon, Israel. Holon bermain di Ligat HaAl, divisi teratas bola " +
                    "basket Israel. Klub memenangkan kejuaraan Israel pertama mereka pada tahun " +
                    "2008, setelah mengalahkan juara abadi Maccabi Tel Aviv di Final Four.",
            "Tim bola basket putra Idaho State Bengals 2018–19 mewakili Idaho State " +
                    "University selama musim bola basket putra Divisi I NCAA 2018–19. Bengals, " +
                    "dipimpin oleh pelatih kepala tahun ketujuh Bill Evans, memainkan pertandingan " +
                    "kandang mereka di Holt Arena dan Reed Gym di Pocatello, Idaho sebagai anggota " +
                    "Konferensi Langit Besar. Mereka menyelesaikan musim 11–19, 7–13 dalam " +
                    "permainan Langit Besar untuk finis di posisi ke-11. Mereka kalah di babak pertama " +
                    "Turnamen Langit Besar dari Utah Selatan.",
            "Kataja Basket Club adalah klub bola basket profesional dari klub olahraga Kataja " +
                    "dari Joensuu, Finlandia. Tim bermain di Korisliiga, tingkat tertinggi bola basket " +
                    "Finlandia. Pada 2015, Kataja memenangkan kejuaraan nasional pertamanya, setelah " +
                    "mengalahkan Bisons Loimaa 3–2 di Final Finlandia.",
            "Tim bola basket putra Kennesaw State Owls mewakili Kennesaw State University " +
                    "di Kennesaw, Georgia, Amerika Serikat. Tim sekolah saat ini berkompetisi di " +
                    "Atlantic Sun Conference. Mereka saat ini dipimpin oleh pelatih kepala Amir " +
                    "Abdur-Rahim dan memainkan pertandingan kandang mereka di Pusat Pertemuan " +
                    "KSU. Selama menjadi anggota NCAA Divisi II, mereka menjadi juara nasional " +
                    "pada tahun 2004.",
            "Klub Košarkarski Koper Primorska (bahasa Inggris: Koper Primorska Basketball " +
                    "Club), biasa disebut sebagai KK Koper Primorska, adalah klub bola basket " +
                    "profesional pria yang berbasis di Koper, Slovenia. Klub ini dibentuk dari " +
                    "penggabungan KOŠ Koper dan KK Lastovka pada tahun 2016, dan dibubarkan " +
                    "pada tahun 2020 karena masalah keuangan.",
            "Tim bola basket putra Loyola Ramblers mewakili Loyola University Chicago di " +
                    "Chicago, Illinois. Ramblers bergabung dengan Konferensi Lembah Missouri pada 1 " +
                    "Juli 2013, mengakhiri masa jabatan 34 musim sebagai anggota piagam Liga " +
                    "Horizon. Pada tahun 1963, Loyola memenangkan Turnamen Bola Basket Divisi I " +
                    "Putra NCAA 1963 (kemudian \"Divisi Universitas NCAA\") kejuaraan nasional bola " +
                    "basket putra di bawah kepemimpinan All-American Jerry Harkness.",
            "New York Liberty adalah tim bola basket profesional Amerika yang berbasis di " +
                    "wilayah metropolitan New York, bermain di Wilayah Timur di Asosiasi Bola " +
                    "Basket Nasional Wanita (WNBA). Tim ini didirikan pada tahun 1997 dan " +
                    "merupakan salah satu dari delapan waralaba asli liga. Tim ini dimiliki oleh Joe " +
                    "Tsai, pemilik mayoritas dari Brooklyn Nets. Pertandingan kandang tim dimainkan " +
                    "di Barclays Center di Brooklyn, New York.",
            "Tim bola basket Old Dominion Monarchs mewakili Universitas Old Dominion di " +
                    "Norfolk, Virginia, Amerika Serikat dalam kompetisi putra Divisi I NCAA. Tim " +
                    "sekolah saat ini berkompetisi di Conference USA. Mereka adalah juara nasional " +
                    "Divisi II pada tahun 1975, juara Turnamen Postseason CollegeInsider.com perdana " +
                    "pada tahun 2009, dan juara Vegas 16 perdana pada tahun 2016. Tim terakhir " +
                    "bermain di Turnamen Divisi I NCAA pada tahun 2019. The Monarchs saat ini " +
                    "dilatih oleh Jeff Jones.",
            "Klubi i Basketbollit Peja (bahasa Inggris: Basketball Club Peja) adalah klub bola " +
                    "basket profesional Kosovar yang berbasis di Pejë. Klub saat ini bermain di Kosovo " +
                    "Basketball Superleague. KB Peja telah memenangkan 6 Kejuaraan Nasional, 4 " +
                    "Piala Bola Basket Kosovo, dan 2 Piala Super Kosovo. Roster tim sudah termasuk " +
                    "nama-nama besar seperti Acie Earl, Fred House, Ricardo Marsh, Samir Shaptahu, " +
                    "Dardan Berisha, dan Gerti Shima.",
            "BC Prievidza adalah klub bola basket profesional yang berbasis di Prievidza, " +
                    "Slovakia. Tim bermain di Slovak Extraliga. Klub memainkan pertandingan " +
                    "kandang di aula olahraga Nike Arena. Salah satu klub basket kuat di liganya.",
            "Shiga Lakes (滋賀レイクス) adalah tim pemain bola basket putra asal Jepang yang " +
                    "bermain di Wilayah Barat pertandingan B. League. Mereka memiliki basis di " +
                    "Prefektur Shiga. Menjadi salah satu tim kesatuan sepak bola Jepang yang terkenal internasional.",
            "Tim bola basket putra Northern Colorado Bears adalah tim bola basket yang " +
                    "mewakili University of Northern Colorado (UNC) di Greeley, Colorado, Amerika " +
                    "Serikat. Tim sekolah saat ini berkompetisi di Big Sky Conference. Beruang pernah " +
                    "tampil di Turnamen Divisi I NCAA sekali, di mana mereka kalah dari San Diego " +
                    "State pada tahun 2011."
    };

    private static int[] sportImages = {
            R.drawable.hapoel,
            R.drawable.idaho,
            R.drawable.kataja,
            R.drawable.kennesaw,
            R.drawable.koper,
            R.drawable.loyola,
            R.drawable.newyork,
            R.drawable.old_dominion,
            R.drawable.peja,
            R.drawable.prievidza,
            R.drawable.shiga,
            R.drawable.unc
    };

    private static String[] sportLinks = {
            "https://www.thesportsdb.com/team/136058",
            "https://www.thesportsdb.com/team/138781",
            "https://www.thesportsdb.com/team/144006",
            "https://www.thesportsdb.com/team/138793",
            "https://www.thesportsdb.com/team/137320",
            "https://www.thesportsdb.com/team/138630",
            "https://www.thesportsdb.com/team/136438",
            "https://www.thesportsdb.com/team/138720",
            "https://www.thesportsdb.com/team/144464",
            "https://www.thesportsdb.com/team/144513",
            "https://www.thesportsdb.com/team/141367",
            "https://www.thesportsdb.com/team/141367"
    };

    static ArrayList<Sport> getListData() {
        ArrayList<Sport> list = new ArrayList<>();
        for(int position = 0; position < sportNames.length; position++) {
            Sport sport = new Sport();
            sport.setName(sportNames[position]);
            sport.setDetail(sportDetails[position]);
            sport.setDesc(sportDesc[position]);
            sport.setPhoto(sportImages[position]);
            sport.setLink(sportLinks[position]);
            list.add(sport);
        }
        return list;
    }
}
