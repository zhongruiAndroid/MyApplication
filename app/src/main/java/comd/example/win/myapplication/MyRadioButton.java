package comd.example.win.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2016/8/29.
 */
public class MyRadioButton extends AppCompatRadioButton {

    private CheckViewHelper viewHelper;

    public MyRadioButton(Context context) {
        super(context);
        init(null);
    }
    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }
    public MyRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }
    private void init(AttributeSet attrs){
        viewHelper=new CheckViewHelper(new ViewHelperInter() {
            @Override
            public void onComplete() {
                complete();
            }
        });
        if(attrs==null){
            return;
        }
        TypedArray viewNormal = this.getContext().obtainStyledAttributes(attrs, R.styleable.MyCheckBox);
        viewHelper.normal_drawable = viewNormal.getDrawable(R.styleable.MyRadioButton_normal_drawable);
        viewHelper.checked_drawable = viewNormal.getDrawable(R.styleable.MyRadioButton_checked_drawable);

        viewHelper.normal_textColor = viewNormal.getColor(R.styleable.MyRadioButton_normal_textColor, this.getTextColors().getDefaultColor());
        viewHelper.checked_textColor = viewNormal.getColor(R.styleable.MyRadioButton_checked_textColor,this.getTextColors().getDefaultColor());

        viewHelper.drawable_left_width = (int) viewNormal.getDimension(R.styleable.MyRadioButton_left_width, -1);
        viewHelper.drawable_left_height = (int) viewNormal.getDimension(R.styleable.MyRadioButton_left_height,-1);


        viewHelper.drawable_top_width =  (int) viewNormal.getDimension(R.styleable.MyRadioButton_top_width, -1);
        viewHelper.drawable_top_height = (int) viewNormal.getDimension(R.styleable.MyRadioButton_top_height,-1);


        viewHelper.drawable_right_width =  (int) viewNormal.getDimension(R.styleable.MyRadioButton_right_width, -1);
        viewHelper.drawable_right_height = (int) viewNormal.getDimension(R.styleable.MyRadioButton_right_height,-1);


        viewHelper.drawable_bottom_width =  (int) viewNormal.getDimension(R.styleable.MyRadioButton_bottom_width, -1);
        viewHelper.drawable_bottom_height = (int) viewNormal.getDimension(R.styleable.MyRadioButton_bottom_height,-1);



        viewHelper.drawable_direction = viewNormal.getInteger(R.styleable.MyRadioButton_drawable_direction, CheckViewHelper.DEFAULT);
        viewNormal.recycle();

        complete();
    }

    /**
     * 设置各个自定义属性之后调用此方法设置ButtonDrawable
     * 这里有必要说明一下,为什么设置属性了还需要调用这个方法才能生效?
     * 这个方法是将代码设置的各个属性收集生成一个Drawable,然后将它设置为ButtonDrawable,简单点这个方法就是用来设置背景的,等价于setButtonDrawable方法
     */
    public void complete() {
        if (viewHelper != null) {
            viewHelper.viewComplete(this);
        }
    }

}
