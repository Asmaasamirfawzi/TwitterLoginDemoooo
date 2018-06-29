package asmaa.com.twitterlogindemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by blur on 6/28/2018.
 */

public class HomePage extends Activity {
    private TextView uname;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.homepage );
        String username=getIntent ().getStringExtra ( "username" );
        uname=findViewById ( R.id.tv_username );
        uname.setText ( username );

    }
}
