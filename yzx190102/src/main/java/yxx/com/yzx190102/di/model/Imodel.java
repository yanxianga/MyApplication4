package yxx.com.yzx190102.di.model;


import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import yxx.com.yzx190102.data.Gridbean;
import yxx.com.yzx190102.data.contain;
import yxx.com.yzx190102.di.contract.mcontract;

public class Imodel implements mcontract.mymodel{
    @Override
    public void contrainData(final Callback callback) {
        OkGo.<String>get(contain.GsonString).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                String s = response.body().toString();
                Gson gson = new Gson();

                Gridbean json = gson.fromJson(s, Gridbean.class);
                callback.onCallback(json);
            }
        });
    }
}
