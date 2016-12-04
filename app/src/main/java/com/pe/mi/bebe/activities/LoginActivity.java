package com.pe.mi.bebe.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;

import com.android.volley.toolbox.Volley;
import com.appsee.Appsee;
import io.fabric.sdk.android.Fabric;

import com.crashlytics.android.core.CrashlyticsCore;
import com.digits.sdk.android.AuthCallback;
import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.DigitsException;
import com.digits.sdk.android.DigitsSession;
import com.pe.mi.bebe.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import io.fabric.sdk.android.Fabric;

public class LoginActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "pWzZTK42XVJh80UhZNeGldTRR";
    private static final String TWITTER_SECRET = "cRBKuSZ1OVqH5uMYlLQUqOcIOIRpytromJU4TWLcPquMuBL2pf";

    Button btnLogin,btnEncuesta;
    EditText txtUs,txtpass;

    public static final String LOGIN_URL = "http://192.168.1.35:8089/ServicioREST/v1/usuarios/login";

    public static final String KEY_USERNAME="usuario";
    public static final String KEY_PASSWORD="contrasena";

    private String user;
    private String pass;
    String data = "";
    TextView results;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits.Builder().build(), new Crashlytics());
        Appsee.start(getString(R.string.com_appsee_apikey));

        setContentView(R.layout.activity_login);
        txtUs = (EditText) findViewById(R.id.txtusu);
        txtpass = (EditText) findViewById(R.id.txtpass);
        btnLogin = (Button) findViewById(R.id.btnIogin);
        btnEncuesta = (Button) findViewById(R.id.btnEncuesta);
        TextView errorMsg;

        TextView textView = (TextView) findViewById(R.id.textView2);
        String htmlString = "<u>Olvidaste tu contraseña?</u>";
        textView.setText(Html.fromHtml(htmlString));

        requestQueue = Volley.newRequestQueue(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //validar nombre de usuario y contraseña -----
                user = txtUs.getText().toString();
                pass = txtpass.getText().toString();

                if (!user.isEmpty() && !pass.isEmpty()) {

                    if(user.equals("Miguel") && pass.equals("12345")){
                        Intent principal = new Intent(LoginActivity.this,PrincipalActivity.class);
                        startActivity(principal);
                        Toast.makeText(LoginActivity.this, "Bienvenido!!", Toast.LENGTH_SHORT).show();
                    }


                    /*Map<String, String> jsonParams = new HashMap<String, String>();
                    //jsonParams.put("usuario", user);
                    //jsonParams.put("contrasena", pass);

                    JsonObjectRequest obreq = new JsonObjectRequest(Request.Method.POST, LOGIN_URL,
                            new JSONObject(jsonParams),
                            new Response.Listener<JSONObject>() {

                                // Takes the response from the JSON request
                                @Override
                                public void onResponse(JSONObject response) {
                                    try {
                                        System.out.println(response);
                                        JSONObject obj = response.getJSONObject("usuarios");
                                        String usuario = obj.getString("usuario");
                                        String contrasena = obj.getString("contrasena");
                                        String nombre = obj.getString("nombre");
                                        String apellido = obj.getString("apellido");
                                        String idusuario = obj.getString("idusuario");

                                        Toast.makeText(LoginActivity.this, "Bienvenido!!", Toast.LENGTH_SHORT).show();
                                        Intent principal = new Intent(LoginActivity.this,PrincipalActivity.class);
                                        principal.putExtra("usuario",usuario);
                                        principal.putExtra("nombre",nombre);
                                        principal.putExtra("nombre",apellido);
                                        principal.putExtra("nombre",idusuario);
                                        startActivity(principal);
                                    }
                                    // Try and catch are included to handle any errors due to JSON
                                    catch (Exception e) {
                                        // If an error occurs, this prints the error to the log
                                        e.printStackTrace();
                                    }
                                }
                            },
                            // The final parameter overrides the method onErrorResponse() and passes VolleyError
                            //as a parameter
                            new Response.ErrorListener() {
                                @Override
                                // Handles errors that occur due to Volley
                                public void onErrorResponse(VolleyError error) {
                                    Toast.makeText(LoginActivity.this, "Usuario o Contraseña Incorrecto", Toast.LENGTH_SHORT).show();
                                    Log.e("Volley", "Error");

                                }
                            }
                    );
                    // Adds the JSON object request "obreq" to the request queue
                    requestQueue.add(obreq);
                    */
                } else {
                    Toast.makeText(LoginActivity.this, "Ingrese el Usuario y Contraseña", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnEncuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent principal = new Intent(LoginActivity.this,pollActivity.class);
                    startActivity(principal);
            }
        });

        DigitsAuthButton digitsButton = (DigitsAuthButton) findViewById(R.id.auth_button);
        digitsButton.setCallback(new AuthCallback() {
            @Override
            public void success(DigitsSession session, String phoneNumber) {
                // TODO: associate the session userID with your user model
                Intent principal = new Intent(LoginActivity.this,PrincipalActivity.class);
                startActivity(principal);
                Toast.makeText(LoginActivity.this, "Autenticación satisfactoria para "+phoneNumber +" !!", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(DigitsException exception) {
                Log.d("Digits", "Sign in with Digits failure", exception);
            }
        });



}

}
