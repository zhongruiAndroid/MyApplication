package comd.example.win.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyLinearLayout ll;
    int i;
    private MyLinearLayout mll;
    private MyImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (MyLinearLayout) findViewById(R.id.ll);
        mll = (MyLinearLayout) findViewById(R.id.mll);
        iv = (MyImageView) findViewById(R.id.iv);
        MyLinearLayout mll2 = (MyLinearLayout) findViewById(R.id.mll2);
        mll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseViewHelper viewHelper = ll.getViewHelper();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    viewHelper.drawable_normal=getDrawable(R.drawable.ic_launcher_background);
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    viewHelper.drawable_press=getDrawable(R.drawable.ic_launcher_background);
                }
                viewHelper.setShapeType(BaseViewHelper.shapeType_line);
                viewHelper.setAllLine(false);
                viewHelper.allLine=false;
                viewHelper.setAllLine(true).complete();
            }
        });

        mll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i%2==0){
                    mll.getViewHelper().clearAttribute().setAllLine(true);
                    mll.complete();
                    iv.setRadius(90).complete();
                }else{
                    mll.getViewHelper().clearAttribute().setAllLine(false).complete();
                    iv.setRadius(20).complete();
                }
                i++;
                if(i==3){

                    mll.getViewHelper().clearAttribute().setAllLine(false).setTopLine(true).complete();

                    Log.i("===","333===");
                }

            }
        });




//        ll.complete();
    }
}
