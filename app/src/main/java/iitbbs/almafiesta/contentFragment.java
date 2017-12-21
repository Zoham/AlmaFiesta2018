package iitbbs.almafiesta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class contentFragment extends Fragment {

    View ret;
    int posn;
    char menu;

    @SuppressLint("ValidFragment")
    public contentFragment(char menuNo, int pos)
    {
        posn = pos;
        menu = menuNo;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(select(posn), container, false);
    }

    int select(int pos) {
        int layout = R.layout.content_main;
        switch (menu) {
            case 'n':
                switch (pos) {
                    case 0:
                        layout = R.layout.news;
                        break;
                    case 1:
                        layout = R.layout.gallery;
                        break;
                    default:
                        layout = R.layout.news;
                        break;
                }
                break;
            case 'p':
                layout = R.layout.map;
                break;
            case 't':
                switch (pos) {
                    case 0:
                        layout = R.layout.team_chiefs;
                        break;
                    case 1:
                        layout = R.layout.team_gensec;
                        break;
                    case 2:
                        layout = R.layout.team_publi;
                        break;
                    case 3:
                        layout = R.layout.team_media;
                        break;
                    case 4:
                        layout = R.layout.team_hospitality;
                        break;
                    case 5:
                        layout = R.layout.team_mun;
                        break;
                    case 6:
                        layout = R.layout.team_pronites;
                        break;
                    case 7:
                        layout = R.layout.team_spons;
                        break;
                    case 8:
                        layout = R.layout.team_events;
                        break;
                    case 9:
                        layout = R.layout.team_transport;
                        break;
                    case 10:
                        layout = R.layout.team_webd;
                        break;
                    case 11:
                        layout = R.layout.team_dnd;
                        break;
                    default:
                        layout = R.layout.team_chiefs;
                }
                break;
            case 'm':
                switch (pos) {
                    case 0:
                        layout = R.layout.m_euphony;
                        break;
                    case 1:
                        layout = R.layout.m_upbeat;
                        break;
                    case 2:
                        layout = R.layout.m_track;
                        break;
                    case 3:
                        layout = R.layout.m_duetto;
                        break;
                    case 4:
                        layout = R.layout.m_unplugged;
                        break;
                    default:
                        layout = R.layout.m_euphony;
                }
                break;
            case 'c':
                switch (pos) {
                    case 0:
                        layout = R.layout.c_ripout;
                        break;
                    case 1:
                        layout = R.layout.c_topsy;
                        break;
                    case 2:
                        layout = R.layout.c_rab;
                        break;
                    default:
                        layout = R.layout.c_ripout;
                }
                break;
            case 'd':
                switch (pos) {
                    case 0:
                        layout = R.layout.d_faceoff;
                        break;
                    case 1:
                        layout = R.layout.d_ncircled;
                        break;
                    case 2:
                        layout = R.layout.d_spotlight;
                        break;
                    default:
                        layout = R.layout.d_faceoff;
                }
                break;
            case 'l':
                switch (pos) {
                    case 0:
                        layout = R.layout.l_litspree;
                        break;
                    case 1:
                        layout = R.layout.l_mun;
                        break;
                    case 2:
                        layout = R.layout.l_debate;
                        break;
                    case 3:
                        layout = R.layout.l_samvad;
                        break;
                    case 4:
                        layout = R.layout.l_drishtikon;
                        break;
                    default:
                        layout = R.layout.l_litspree;
                }
                break;
            case 'a':
                switch (pos) {
                    case 0:
                        layout = R.layout.a_shaedz;
                        break;
                    case 1:
                        layout = R.layout.a_rangoli;
                        break;
                    default:
                        layout = R.layout.a_shaedz;
                }
                break;
            case 'q':
                switch (pos) {
                    case 0:
                        layout = R.layout.q_biz;
                        break;
                    case 1:
                        layout = R.layout.q_youth;
                        break;
                    default:
                        layout = R.layout.q_biz;
                }
                break;
            case 'f':
                switch (pos) {
                    case 0:
                        layout = R.layout.f_ad;
                        break;
                    case 1:
                        layout = R.layout.f_pic;
                        break;
                    case 2:
                        layout = R.layout.f_short;
                        break;
                    case 3:
                        layout = R.layout.f_docu;
                        break;
                    default:
                        layout = R.layout.f_ad;
                }
                break;
        }
        return layout;
    }
}