package com.pkh.practice.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pkh.practice.Model.User;
import com.pkh.practice.Presenter.MainPresenter;
import com.pkh.practice.Presenter.MainPresenterImpl;
import com.pkh.practice.R;

/**
 * 이번 프로젝트는 MVP 패턴을 공부 및 실습입니다
 * 군대에 입대하기전 MVC 패턴을 이용하여 프로젝트를 한 경험이 있지만, 정확하게 이해하지 못하고 넘어가 많이 아쉬웠습니다
 * MVC 패턴을 다시 공부하는 것보다는 현재 안드로이드 개발에 많이 사용되는 MVP 패턴을 공부하는 것이 더 좋다고 생각하여
 * 이에 대해서 진행해보도록 하겠습니다.
 * MVP 패턴은 MVC패턴에서 나온 것으로
 * model - view - presenter 입니다
 *
 * Presenter
 * Presenter는 중간자로 View와 모델 사이의 행위에 책임이 있다.
 * Presenter는 data를 모델로 부터 받거나 뷰에 적합하게 돌려준다. 당신이 뷰와 함께 상호 작용하여 발생하는 것을 결정하는 것이 일반적인 MVC와 다릅니다.
 *
 * View
 * 뷰는 일반적으로 엑티비티에서 구현하고 presenter 대한 참조가 포함된다.View가 하는 일은 Presenter의 인터페이스를 상속 받아 메서드를 호출 하는 것이다.
 *
 * Model
 * 좋은 계층화 구조를 포함하는 애플리케이션에서 model은 도메인 레이아웃 또는 비지니스 로직이 되기 위한 유일한 관문이다.
 * 우리가 View에서 표시하고 전하는 데이타를 제공해 주는 것이라고 알고 있으면 됩니다.
 */

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    private MainPresenter presenter;
    private TextView click;
    private TextView other;

    private TextView userName;
    private TextView userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenterImpl(this);
        click = (TextView) findViewById(R.id.textConfirm);
        other = (TextView) findViewById(R.id.other);
        userName = (TextView)findViewById(R.id.userName);
        userAge = (TextView)findViewById(R.id.userAge);


        click.setOnClickListener(this);
        other.setOnClickListener(this);
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void changeText(User user) {
        userName.setText(user.name);
        userAge.setText(String.valueOf(user.age));
    }

    @Override
    public void resetText() {
        userName.setText("name");
        userAge.setText("age");
    }

    @Override
    public void onClick(View view) {
        User user = new User("park",25);
        presenter.OnClickSampleBtn(view.getId(),user);
    }
}