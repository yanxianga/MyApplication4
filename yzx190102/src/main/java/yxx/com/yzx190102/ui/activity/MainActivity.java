package yxx.com.yzx190102.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import yxx.com.yzx190102.R;
import yxx.com.yzx190102.data.Gridbean;
import yxx.com.yzx190102.di.contract.mcontract;
import yxx.com.yzx190102.di.presenter.Ipresenter;

public class MainActivity extends AppCompatActivity implements mcontract.myView {

    @butterknife.BindView(R.id.griod)
    GridView griod;
    private Ipresenter ipresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);

        ipresenter = new Ipresenter();
        ipresenter.attachview(this);



    }


    @Override
    public void shapData(Gridbean requestdata) {

    }
}
