package com.pkh.practice.Presenter;

import com.pkh.practice.Model.User;
import com.pkh.practice.R;
import com.pkh.practice.View.MainView;

/**
 * Created by kh on 2016. 9. 3..
 */
public class MainPresenterImpl implements MainPresenter{

    private MainView mainView;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    public MainView getMainView() {
        return mainView;
    }

    @Override
    public void OnClickSampleBtn(int id, User user) {
        switch (id){
            case R.id.textConfirm:
                mainView.showMessage("change");
                mainView.changeText(user);
                break;
            default:
                mainView.showMessage("reset");
                mainView.resetText();
                break;
        }
    }
}
