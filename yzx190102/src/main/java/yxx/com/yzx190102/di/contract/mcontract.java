package yxx.com.yzx190102.di.contract;

import android.widget.GridView;

import yxx.com.yzx190102.data.Gridbean;

public interface mcontract {

    //创建v层
    public interface myView{
        public void shapData(Gridbean requestdata);
    }

    //创建p层
    public interface mypresenter<myView>{

        public void  attachview(mcontract.myView myView);

        public void detachview(mcontract.myView myView);

        public void requestData();
    }

    public interface  mymodel{

        public void contrainData(Callback callback);

        public interface  Callback{
            public void onCallback(Gridbean requestdata);
        }
    }
}
