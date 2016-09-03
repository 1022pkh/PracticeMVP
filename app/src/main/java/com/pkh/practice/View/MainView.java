package com.pkh.practice.View;

import com.pkh.practice.Model.User;

/**
 * Created by kh on 2016. 9. 3..
 */
public interface MainView {
    void showMessage(String msg);
    void changeText(User user);
    void resetText();
}
