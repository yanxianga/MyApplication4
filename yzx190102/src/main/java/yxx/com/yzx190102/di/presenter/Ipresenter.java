package yxx.com.yzx190102.di.presenter;

import java.lang.ref.SoftReference;

import yxx.com.yzx190102.data.Gridbean;
import yxx.com.yzx190102.di.contract.mcontract;
import yxx.com.yzx190102.di.model.Imodel;

public class Ipresenter implements mcontract.mypresenter{
    mcontract.myView myView;
    private SoftReference<mcontract.myView> softReference;
    private Imodel imodel;

    @Override
    public void attachview(mcontract.myView myView) {
        this.myView = myView;

        softReference = new SoftReference<>(myView);

        imodel = new Imodel();
    }

    @Override
    public void detachview(mcontract.myView myView) {
        softReference.clear();
    }

    @Override
    public void requestData() {
        imodel.contrainData(new mcontract.mymodel.Callback() {
            @Override
            public void onCallback(Gridbean requestdata) {
                myView.shapData(requestdata);
            }

        });
    }


}
