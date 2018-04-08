package comd.example.win.myapplication;

import android.graphics.drawable.Drawable;

/**
 * Created by windows10 on 2018/4/8.
 */

public class CheckViewHelper {
    protected Drawable normal_drawable;
    protected Drawable checked_drawable;
    protected int normal_textColor;
    protected int checked_textColor;
    protected int drawable_direction;

    protected int drawable_left_width;
    protected int drawable_left_height;
    protected int drawable_top_width;
    protected int drawable_top_height;
    protected int drawable_right_width;
    protected int drawable_right_height;
    protected int drawable_bottom_width;
    protected int drawable_bottom_height;

    /***显示Drawable方向--默认*/
    public static final int DEFAULT=0;
    /***显示Drawable方向--左边*/
    public static final int LEFT=1;
    /***显示Drawable方向--顶部*/
    public static final int TOP=2;
    /***显示Drawable方向--右边*/
    public static final int RIGHT=3;
    /***显示Drawable方向--底部*/
    public static final int BOTTOM=4;

    public Drawable getNormal_drawable() {
        return normal_drawable;
    }

    public void setNormal_drawable(Drawable normal_drawable) {
        this.normal_drawable = normal_drawable;
    }

    public Drawable getChecked_drawable() {
        return checked_drawable;
    }

    public void setChecked_drawable(Drawable checked_drawable) {
        this.checked_drawable = checked_drawable;
    }

    public int getNormal_textColor() {
        return normal_textColor;
    }

    public void setNormal_textColor(int normal_textColor) {
        this.normal_textColor = normal_textColor;
    }

    public int getChecked_textColor() {
        return checked_textColor;
    }

    public void setChecked_textColor(int checked_textColor) {
        this.checked_textColor = checked_textColor;
    }

    public int getDrawable_direction() {
        return drawable_direction;
    }

    public void setDrawable_direction(int drawable_direction) {
        this.drawable_direction = drawable_direction;
    }

    public int getDrawable_left_width() {
        return drawable_left_width;
    }

    public void setDrawable_left_width(int drawable_left_width) {
        this.drawable_left_width = drawable_left_width;
    }

    public int getDrawable_left_height() {
        return drawable_left_height;
    }

    public void setDrawable_left_height(int drawable_left_height) {
        this.drawable_left_height = drawable_left_height;
    }

    public int getDrawable_top_width() {
        return drawable_top_width;
    }

    public void setDrawable_top_width(int drawable_top_width) {
        this.drawable_top_width = drawable_top_width;
    }

    public int getDrawable_top_height() {
        return drawable_top_height;
    }

    public void setDrawable_top_height(int drawable_top_height) {
        this.drawable_top_height = drawable_top_height;
    }

    public int getDrawable_right_width() {
        return drawable_right_width;
    }

    public void setDrawable_right_width(int drawable_right_width) {
        this.drawable_right_width = drawable_right_width;
    }

    public int getDrawable_right_height() {
        return drawable_right_height;
    }

    public void setDrawable_right_height(int drawable_right_height) {
        this.drawable_right_height = drawable_right_height;
    }

    public int getDrawable_bottom_width() {
        return drawable_bottom_width;
    }

    public void setDrawable_bottom_width(int drawable_bottom_width) {
        this.drawable_bottom_width = drawable_bottom_width;
    }

    public int getDrawable_bottom_height() {
        return drawable_bottom_height;
    }

    public void setDrawable_bottom_height(int drawable_bottom_height) {
        this.drawable_bottom_height = drawable_bottom_height;
    }
}
