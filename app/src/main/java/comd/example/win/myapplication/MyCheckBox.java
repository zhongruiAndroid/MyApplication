package comd.example.win.myapplication;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2016/8/29.
 */
public class MyCheckBox extends AppCompatCheckBox {

   private CheckViewHelper viewHelper;

    public MyCheckBox(Context context) {
        super(context);
            init(null);
    }
    public MyCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
            init(attrs);
    }
    public MyCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
            init(attrs);
    }
    private void init(AttributeSet attrs){
        viewHelper=new CheckViewHelper();
        if(attrs==null){
            return;
        }
        TypedArray viewNormal = this.getContext().obtainStyledAttributes(attrs, R.styleable.MyCheckBox);
        viewHelper.normal_drawable = viewNormal.getDrawable(R.styleable.MyCheckBox_normal_drawable);
        viewHelper.checked_drawable = viewNormal.getDrawable(R.styleable.MyCheckBox_checked_drawable);

        viewHelper.normal_textColor = viewNormal.getColor(R.styleable.MyCheckBox_normal_textColor, this.getTextColors().getDefaultColor());
        viewHelper.checked_textColor = viewNormal.getColor(R.styleable.MyCheckBox_checked_textColor,this.getTextColors().getDefaultColor());

        viewHelper.drawable_left_width = (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_left_width, -1);
        viewHelper.drawable_left_height = (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_left_height,-1);


        viewHelper.drawable_top_width =  (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_top_width, -1);
        viewHelper.drawable_top_height = (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_top_height,-1);


        viewHelper.drawable_right_width =  (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_right_width, -1);
        viewHelper.drawable_right_height = (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_right_height,-1);


        viewHelper.drawable_bottom_width =  (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_bottom_width, -1);
        viewHelper.drawable_bottom_height = (int) viewNormal.getDimension(R.styleable.MyCheckBox_drawable_bottom_height,-1);



        viewHelper.drawable_direction = viewNormal.getInteger(R.styleable.MyCheckBox_drawable_direction, CheckViewHelper.DEFAULT);
        viewNormal.recycle();

        complete();
    }

    /**
     * 设置各个自定义属性之后调用此方法设置ButtonDrawable
     * 这里有必要说明一下,为什么设置属性了还需要调用这个方法才能生效?
     * 这个方法是将代码设置的各个属性收集生成一个Drawable,然后将它设置为ButtonDrawable,简单点这个方法就是用来设置背景的,等价于setButtonDrawable方法
     */
    public void complete() {
        if(viewHelper.normal_drawable !=null&& viewHelper.checked_drawable !=null){

            int[] leftDrawable=getDrawableWidthAndHeight(CheckViewHelper.LEFT);

            int[] topDrawable=getDrawableWidthAndHeight(CheckViewHelper.TOP);

            int[] rightDrawable=getDrawableWidthAndHeight(CheckViewHelper.RIGHT);

            int[] bottomDrawable=getDrawableWidthAndHeight(CheckViewHelper.BOTTOM);

            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, viewHelper.checked_drawable);
            stateListDrawable.addState(new int[]{}, viewHelper.normal_drawable);

            Drawable drawable0 = getCompoundDrawables()[0];
            Drawable drawable1 = getCompoundDrawables()[1];
            Drawable drawable2 = getCompoundDrawables()[2];
            Drawable drawable3 = getCompoundDrawables()[3];
            if(drawable0!=null){
                drawable0.setBounds(0,0,leftDrawable[0],leftDrawable[1]);
            }
            if(drawable1!=null){
                drawable1.setBounds(0,0,topDrawable[0],topDrawable[1]);
            }
            if(drawable2!=null){
                drawable2.setBounds(0,0,rightDrawable[0],rightDrawable[1]);
            }
            if(drawable3!=null){
                drawable3.setBounds(0,0,bottomDrawable[0],bottomDrawable[1]);
            }
            switch (viewHelper.drawable_direction){
                case CheckViewHelper.DEFAULT:
                    this.setButtonDrawable(stateListDrawable);
                break;
                case CheckViewHelper.LEFT:
                    stateListDrawable.setBounds(0,0,leftDrawable[0],leftDrawable[1]);
                    this.setCompoundDrawables(stateListDrawable,drawable1,drawable2,drawable3);
                break;
                case CheckViewHelper.TOP:
                    stateListDrawable.setBounds(0,0,topDrawable[0],topDrawable[1]);
                    this.setCompoundDrawables(drawable0,stateListDrawable,drawable2,drawable3);
                break;
                case CheckViewHelper.RIGHT:
                    stateListDrawable.setBounds(0,0,rightDrawable[0],rightDrawable[1]);
                    this.setCompoundDrawables(drawable0,drawable1,stateListDrawable,drawable3);
                break;
                case CheckViewHelper.BOTTOM:
                    stateListDrawable.setBounds(0,0,bottomDrawable[0],bottomDrawable[1]);
                    this.setCompoundDrawables(drawable0,drawable1,drawable2,stateListDrawable);
                break;
            }
        }

        int [][]colorState=new int[2][];
        int []myColor=new int[]{viewHelper.checked_textColor, viewHelper.normal_textColor};
        colorState[0]=new int[]{android.R.attr.state_checked};
        colorState[1]=new int[]{};
        ColorStateList colorStateList=new ColorStateList(colorState,myColor);
        this.setTextColor(colorStateList);

    }

    private int[] getDrawableWidthAndHeight(int drawable_direction) {
        switch (drawable_direction){
            case CheckViewHelper.DEFAULT:

                break;
            case CheckViewHelper.LEFT:

                break;
            case CheckViewHelper.TOP:

                break;
            case CheckViewHelper.RIGHT:

                break;
            case CheckViewHelper.BOTTOM:

                break;
        }
        return new int[]{40,40};
    }

}
