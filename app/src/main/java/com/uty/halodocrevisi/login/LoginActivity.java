package com.uty.halodocrevisi.login;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseUser;
import com.uty.halodocrevisi.MainActivity;
import com.uty.halodocrevisi.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity{

    public ImageButton eye;
    public EditText loginPassword;
    private FirebaseAuth mAuth;

    EditText email_;
    EditText password_;
    Button login_;

    private ActivityLoginBinding binding;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        } else {
            //returns to login
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mAuth = FirebaseAuth.getInstance();

        eye = (ImageButton) binding.eye;
        loginPassword = (EditText) binding.loginPassword;

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked();
            }
        });
        email_ = (EditText) binding.loginEmail;
        password_ = (EditText) binding.loginPassword;
        login_ = (Button) binding.loginButton;

        login_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String email = email_.getText().toString();
        String password = password_.getText().toString();

        if(TextUtils.isEmpty(email)){
            email_.setError("Email Tidak Boleh Kosong!");
            email_.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            password_.setError("Password Tidak Boleh Kosong!");
            password_.requestFocus();
        }
        else{
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                @Override
                public void onComplete(@NonNull Task<AuthResult> task){
                    if(task.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "Berhasil Masuk", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }
                    else{
                        Toast.makeText(LoginActivity.this, "Gagal Masuk " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void awesomeButtonClicked() {
        final int selection = loginPassword.getSelectionEnd();
        if(loginPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){

//            eye.setImageResource(binding.eyeopen);
            //Show Password
            loginPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        else{
//            eye.setImageResource(R.drawable.eyeopen_);
            //Hide Password
            loginPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        loginPassword.setSelection(selection);

    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}