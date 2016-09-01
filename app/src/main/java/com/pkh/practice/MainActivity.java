package com.pkh.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 이번 프로젝트는 MVP 패턴을 공부 및 실습입니다
 * 군대에 입대하기전 MVC 패턴을 이용하여 프로젝트를 한 경험이 있지만, 정확하게 이해하지 못하고 넘어가 많이 아쉬웠습니다
 * MVC 패턴을 다시 공부하는 것보다는 현재 안드로이드 개발에 많이 사용되는 MVP 패턴을 공부하는 것이 더 좋다고 생각하여
 * 이에 대해서 진행해보도록 하겠습니다.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
