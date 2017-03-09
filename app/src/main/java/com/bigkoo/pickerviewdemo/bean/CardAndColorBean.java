package com.bigkoo.pickerviewdemo.bean;

import com.bigkoo.pickerview.model.IPickerViewData;
import com.bigkoo.pickerview.model.IPickerViewDataAndColor;

/**
 * Created by KyuYi on 2017/3/2.
 * E-Mail:kyu_yi@sina.com
 * 功能：
 */

public class CardAndColorBean implements IPickerViewDataAndColor {
    int id;
    String cardNo;
    private boolean isBlackColor;


    public CardAndColorBean(int id, String cardNo, boolean isBlackColor) {
        this.id = id;
        this.cardNo = cardNo;
        this.isBlackColor = isBlackColor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public boolean isBlackColor() {
        return isBlackColor;
    }

    public void setBlackColor(boolean blackColor) {
        isBlackColor = blackColor;
    }


    @Override
    public String getPickerViewText() {
        return cardNo;
    }

    @Override
    public boolean getPickerViewTextIsBlack() {

        return isBlackColor;
    }
}
